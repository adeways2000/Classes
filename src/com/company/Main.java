package com.company;

public class Main {

    public static void main(String[] args) {
		Car porsche = new Car();
		Car Benz = new Car();
		porsche.setModel("carrera");
		Benz.setModel("mercedes");
		System.out.println("Porsche Model is " + porsche.getModel() +  " and Benz model is " + Benz.getModel());
    }
}
