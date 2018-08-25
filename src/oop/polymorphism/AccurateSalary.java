package oop.polymorphism;

public class AccurateSalary extends ManagerSalary {
    @Override
    public int yearly(int a, int b, int c, int d) {
        int total = a + b + c + d - 2000;
        return total;
    }
}
