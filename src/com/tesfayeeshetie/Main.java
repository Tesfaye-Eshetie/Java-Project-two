package com.tesfayeeshetie;

public class Main {

    public static void main(String[] argv) {
        Smartphone one = new Smartphone("apple", "iphone 12",
                "ios", 128, "black", 2, 699.00);
        Smartphone two = new Smartphone("samsung", "galaxy note",
                "android", 256, "mystic bronze", 3, 349.00);
        Smartphone three = new Smartphone("samsung", "Galaxy S21 Ultra",
                "android", 128000, "Burgundy", 3, 1199.99);
        Smartphone four = new Smartphone("samsung", "Galaxy S21 Ultra",
                "android", 128, "Navy", 3, 1199.99 );
        Smartphone five = new Smartphone("Google", "Pixel 6 Pro",
                "android", 256, "Cloudy White", 2, 899);
        Smartphone six = new Smartphone("Apple", "iPhone 13",
                "ios", 128, "Blue", 2, 1299.99);

//        one.show();
//        two.show();
//        three.show();

//
//        one.onlyShowAndroid();
//        two.onlyShowAndroid();
//        three.onlyShowAndroid();

        PhoneStore store1 = new PhoneStore("Best Buy", "123 Main St, NY, NY, 10010");
        store1.inventory[0] = one;
        store1.inventory[1] = two;
        store1.inventory[2] = three;
        store1.show();

        PhoneStore store2 = new PhoneStore("Walmart", "1001 Shiloh Glenn Dr, Cary, NC 27661");
        store2.inventory[0] = five;
        store2.inventory[1] = four;
        store2.inventory[2]= one;
        store2.show();
        store2.showAndroid();

        PhoneStore store3 = new PhoneStore("T-mobile", "189 Grand Hill pl, Holly Springs, Nc 27591");
        store3.inventory[0] = six;
        store3.inventory[1] = one;
        store3.inventory[2] = four;
        store3.show();
        store3.showAndroid();

    }

}
