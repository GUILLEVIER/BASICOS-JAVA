package com.guillevier.resumen.clases;

class InterfazMultiple implements FirstInterface, SecondInterface {

    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }

    public static void main(String[] args) {
        InterfazMultiple myObj = new InterfazMultiple();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
