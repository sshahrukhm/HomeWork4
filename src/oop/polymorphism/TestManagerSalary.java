package oop.polymorphism;

public class TestManagerSalary {
    public static void main(String[] args) {
        ManagerSalary mas = new ManagerSalary();
        System.out.println(mas.weekly(500, 300));
        System.out.println(mas.monthly(4300, 300, 200));
        System.out.println(mas.yearly(11000, 18000, 10000, 30000));

        AccurateSalary acs = new AccurateSalary();
        System.out.println(acs.yearly(11000, 18000, 10000, 30000));


    }
}
