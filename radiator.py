import time
import datetime
import csv

comparison_count = 0
swap_count = 0


class Radiator:
    def __init__(self, thermal_power_in_wats: float, colour: str, producer: str, wheelbase_in_mm: float):
        self.thermal_power_in_wats = thermal_power_in_wats
        self.colour = colour
        self.producer = producer
        self.wheelbase_in_mm = wheelbase_in_mm

    def __str__(self):
        return 'Thermal power in wats: {}, Colour: {}, Producer: {},Wheelbase in mm: {}'.format(
            self.thermal_power_in_wats, self.colour, self.producer, self.wheelbase_in_mm)


def get_csv(file_name: str):
    radiators = []

    with open(file_name, 'r') as file:
        reader = csv.reader(file)
        for line in reader:
            radiators.append(Radiator(float(line[0]), str(line[1]), str(line[2]), float(line[3])))
    return radiators


def selection_sort(list_to_sort: list, key):
    comparison_count = 0
    swap_count = 0
    start_time = datetime.datetime.now()
    for num in range(len(list_to_sort)):
        min_value = num
        for item in range(num, len(list_to_sort)):
            comparison_count += 1
            if key(list_to_sort[min_value]) > key(list_to_sort[item]):
                min_value = item
        list_to_sort[min_value], list_to_sort[num] = list_to_sort[num], list_to_sort[min_value]
        swap_count += 1
    print(f"[Selection Sort] Comparisons: {comparison_count}, swaps: {swap_count}, "
          f"execution time: {start_time - datetime.datetime.now()} sec")
    return list_to_sort


def heapify(list_to_sort, length, item, key):
    global comparison_count
    global swap_count
    least = item
    left = 2 * item + 1
    right = 2 * item + 2
    comparison_count += 3

    if left < length and key(list_to_sort[item]) > key(list_to_sort[left]):
        least = left

    if right < length and key(list_to_sort[least]) > key(list_to_sort[right]):
        least = right

    if least != item:
        swap_count += 1
        list_to_sort[item], list_to_sort[least] = list_to_sort[least], list_to_sort[item]
        heapify(list_to_sort, length, least, key)


def min_heap(list_to_sort: list, key):
    start_time = datetime.datetime.now()
    global swap_count

    length = len(list_to_sort)
    for i in range(length, -1, -1):
        heapify(list_to_sort, length, i, key)

    for i in range(length - 1, 0, -1):
        swap_count += 1
        list_to_sort[0], list_to_sort[i] = list_to_sort[i], list_to_sort[0]
        heapify(list_to_sort, i, 0, key)
    print(f"[Min-Heap Sort] Comparisons: {comparison_count}, swaps: {swap_count}, "
          f"execution time: {datetime.datetime.now() - start_time} sec")
    return list_to_sort


if __name__ == '__main__':
    input_data = get_csv('radiators.csv')
    min_heap(input_data, key=lambda x: x.thermal_power_in_wats)
    time.sleep(0.5)
    for i in input_data:
        print(i)
    time.sleep(0.5)
    selection_sort(input_data, key=lambda x: x.wheelbase_in_mm)
    time.sleep(0.5)
    for i in input_data:
        print(i)
