package oop.polymorphism;

public class ManagerSalary {
    public int weekly(int a, int b) {
        int total = a + b;
        return total;
    }

    public int monthly(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    public int yearly(int a, int b, int c, int d) {
        int total = a + b + c + d;
        return total;
    }

}
