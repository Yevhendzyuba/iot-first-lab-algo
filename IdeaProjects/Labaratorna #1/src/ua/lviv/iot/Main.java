package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {

        ElectricLamp ads = new ElectricLamp();
        ElectricLamp philips = new ElectricLamp(9.4f, 120, "German", "Plastic,Glass,Metal", "LedBulb", "White");
        ElectricLamp osram = new ElectricLamp(97.55f, 54.25f, 5.2f, 145, "Italy", "Plastic,Glass,Metal",
                "Led Lamp MR16", "Blue");

        System.out.println(ads.toString());
        System.out.println(philips.toString());
        System.out.println(osram.toString());
        System.out.println("\n\n\n");

        ElectricLamp[] ElectricLampArray = new ElectricLamp[4];
        int calculation = 0;
        do {
            ElectricLampArray[calculation] = new ElectricLamp();
            calculation++;
        } while (calculation < 4);

        for (ElectricLamp x : ElectricLampArray) {
            System.out.println(x.toString());

        }

    }
}
