package com.tesfayeeshetie;

public class PhoneStore {
    String name;            // name of the store
    String address;            // street address of the store
    Smartphone[] inventory;    // inventory of Smartphones in this store

    public PhoneStore(String name, String address) {
        this.name = name;
        this.address = address;
        this.inventory = new Smartphone[3];
    }

    public void show() {
        System.out.printf("%nName: %s, Address: %s,%n Inventory of Smartphones from this store: %n"
                , name, address);
        for (Smartphone phone: inventory) {
            phone.show();
        }
    }

    public void showAndroid() {
        System.out.printf("%nName: %s, Address: %s,%n Show only Android phones from this store: %n"
                , name, address);
        for (Smartphone androidPhone: inventory) {
            androidPhone.onlyShowAndroid();
        }
    }
}
