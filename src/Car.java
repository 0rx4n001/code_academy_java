class Car {
    String model;
    String color;
    int year;

    Car(String model) {
        this.model = model;
    }

    // 2-ci konstruktor: Model və rəngi qəbul edir
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }

}
