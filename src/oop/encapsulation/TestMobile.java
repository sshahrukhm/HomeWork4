package oop.encapsulation;

public class TestMobile {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.setMobileBrand("iPhone");
        mb.getMobileBrand();
        mb.setMobileColor("White");
        mb.getMobileColor();

        System.out.println( mb.getMobileBrand()+" "+  mb.getMobileColor());
    }
}
