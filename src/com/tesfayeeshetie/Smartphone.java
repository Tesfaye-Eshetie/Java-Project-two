package com.tesfayeeshetie;

public class Smartphone {
    String manufacturer;    // company
    String model;            // specific model
    String operatingSys;    // operating system android, ios, linux...
    int memory;                // memory in GB
    String color;            // primary color
    int cameraLenses;        // number of camera lenses
    double price;            // how much does it cost

    public Smartphone(String manufacturer, String model, String operatingSys, int memory, String color, int cameraLenses, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSys = operatingSys;
        this.memory = memory;
        this.color = color;
        this.cameraLenses = cameraLenses;
        this.price = price;

    }

    public void show() {
        System.out.printf("Phones specifications manufactured by: %s, " +
                "model: %s, " +
                "operating system: %s, memory: %s, " +
                "%s color, numbers of lenses: %s, " +
                "price: %s. %n", manufacturer, model, operatingSys, memory, color, cameraLenses, price);
    }

    public void onlyShowAndroid() {
        if (operatingSys.equalsIgnoreCase("android" )) {
            System.out.printf(
                    "Manufactured: %s, " +
                            "Model: %s, " +
                            "Operating system: %s, " +
                            "Color: %s, " +
                            "Number of lenses: %s, " +
                            "Price: %s, %n", manufacturer, model, operatingSys, color, cameraLenses, price);
        }
    }
}


