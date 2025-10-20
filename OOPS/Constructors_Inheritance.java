
class Base {

    int a;

    Base(int a) {
        this.a = a;
        System.out.println("Base constructor with one arg " + a);
    }
}

class Derived extends Base {

    Derived(int a) {
        super(a);
        System.out.println("Derived constructor");
    }
}

public class Constructors_Inheritance {

    public static void main(String[] args) {
        Derived d = new Derived(10);
    }
}
