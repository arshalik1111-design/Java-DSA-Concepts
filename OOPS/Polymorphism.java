
class displayOverloading {

    public void show(int number) {
        System.out.println(number);
    }

    public void show(String text) {
        System.out.println(text);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        displayOverloading obj = new displayOverloading();

        obj.show("Hello World");
        obj.show(100);
    }
}
