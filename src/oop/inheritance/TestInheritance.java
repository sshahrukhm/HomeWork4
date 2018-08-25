package oop.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        ProductOwner po = new ProductOwner();
        po.productOwnerName();
        po.developerName();
        po.managerName();

        Manager manager = new Manager();
        manager.managerName();

    }
}
