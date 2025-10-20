
class Vehicle {

    public String brandName;

    public void brandName(String brandName) {
        this.brandName = brandName;

    }

    public void honk() {
        System.out.println("aHonks");
    }
}

class Car extends Vehicle {

    String modelName;

    public void modelName(String modelName) {
        this.modelName = modelName;

    }

    public void luxury() {
        System.out.println("This car represents Luxury.");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brandName("Lexus");
        c1.modelName(" es 300h");
        System.out.print(c1.brandName);
        System.out.println(c1.modelName);
        c1.luxury();

    }

}
