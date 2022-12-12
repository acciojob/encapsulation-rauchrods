package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name="dsd";
//        java: name has private access in com.driver.RWOnly
        obj.setName("Rauch");
        System.out.println(obj.getName());
    }
}