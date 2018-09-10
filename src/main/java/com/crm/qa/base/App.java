package com.crm.qa.base;

import com.crm.qa.base.CarParts.Wheel;

public class App {

    public static void main(String[] args) {
    	CarParts carParts = new CarParts();
    	CarParts.Wheel wheel = new CarParts.Wheel();
    }

}
 class  CarParts {
	 //private static int factoryID = 123;
    public static class Wheel {
        public  Wheel() {
            System.out.println("Wheel created with factory ID : " );
        }
    }

    public CarParts() {
        System.out.println("Car Parts object created!");
    }
}
 
