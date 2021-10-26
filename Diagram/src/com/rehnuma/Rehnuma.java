package com.rehnuma;

public class Rehnuma extends Laptop {
    Rehnuma() {
        name = "MSI";
    }

    @Override
    void aboutGadget() {
//        super.aboutGadget();
        System.out.println(name  + " Laptop");
        System.out.println(price + "$");
    }
}
