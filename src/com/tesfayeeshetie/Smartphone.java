package com.tesfayeeshetie;

public class Smartphone {
    private String manufacturer;    // company
    private String model;            // specific model
    private String operatingSys;    // operating system android, ios, linux...
    private int memory;                // memory in GB
    private String color;            // primary color
    private int cameraLenses;        // number of camera lenses
    private double price;            // how much does it cost

    public Smartphone(String manufacturer, String model, String operatingSys,
                      int memory, String color, int cameraLenses, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSys = operatingSys;
        this.memory = memory;
        this.color = color;
        this.cameraLenses = cameraLenses;
        this.price = price;
    }

    public void show() {
        System.out.printf("Manufactured by: %s, " +
                "model: %s, " +
                "operating system: %s, memory: %s, " +
                "%s color, numbers of lenses: %s, " +
                "price: %s. %n", manufacturer, model, operatingSys, memory, color, cameraLenses, price);
    }

    public void onlyShowAndroid() {
        if (operatingSys.equalsIgnoreCase("android" ))
            show();
    }
}


