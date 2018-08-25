package oop.abstraction;

public class MyFamily extends SundayHome implements Family {


    public void breakfast() {
        System.out.println("Egg and Cheese");

    }


    public void home() {
        System.out.println("This is My Home");

    }


    public void parents() {
        System.out.println("My parents does not live here");

    }

    public void sonsanddaughter() {
        System.out.println("I don't have any kid");

    }
}
