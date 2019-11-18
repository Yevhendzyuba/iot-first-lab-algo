#include<iostream>
#include"Bike.hpp"
#include "string"
using namespace std;

Bike::Bike(){

    this->name = "none";
    this->mass = 0;
    this->maxMass = 0;
    this->gears = 0;
    this->speed = 0;
    this->model = "none";
    this->colour = "none";
    this->maxSpeed = 0;
}
Bike::Bike(string name, double mass, double maxMass,int gears,string colour,double maxSpeed){

    this->name = name;
    this->mass = mass;
    this->maxMass = maxMass;
    this->gears = gears;
    this->colour = colour;
    this->maxSpeed = maxSpeed;
}
Bike::Bike(string name, double mass, double maxMass, int gears, double speed, string model, string colour, double maxSpeed){
    this->name = name;
    this->mass = mass;
    this->maxMass = maxMass;
    this->gears = gears;
    this->speed = speed;
    this->model = model;
    this->colour = colour;
    this->maxSpeed = maxSpeed;
}
Bike::~Bike(){
    this->name = " ";
    this->mass = 0;
    this->maxMass = 0;
    this->gears = 0;
    this->speed = 0;
    this->model = " ";
    this->colour = " ";
    this->maxSpeed = 0;
}

string Bike::getName(){
    return this->name;
}
double Bike::getMass(){
    return this->mass;
}

double Bike::getMaxMass() {
    return this->maxMass;
}
int Bike::getGears(){
    return this->gears;
}
void Bike::PrintAllFields(){
    cout<<"\tName:"<<this->name<<endl;
    cout<<"\tMass:"<<this->mass<<endl;
    cout<<"\tMaxMass:"<<this->maxMass<<endl;
    cout<<"\tGears:"<<this->gears<<endl;
    cout<<"\tSpeed:"<<this->speed<<endl;
    cout<<"\tModel:"<<this->model<<endl;
    cout<<"\tColour:"<<this->colour<<endl;
    cout<<"\tMaxSpeed:"<<this->maxSpeed<<endl;

}
