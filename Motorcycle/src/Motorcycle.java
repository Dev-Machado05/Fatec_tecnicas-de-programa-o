public class Motorcycle {
    String maker;
    String color;
    boolean engineState;

    void startEngine() {
        if (engineState == true)
            System.out.println("The engine is already on.");
        else
            engineState = true;
            System.out.println("The engine is now on.");
    }

    void showAtts() {
        System.out.println("This motorcycle is a " + color + " " + maker);
        if (engineState == true)
            System.out.println("The engine is on.");
        else
            System.out.println("The engine is off.");
    }

    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.maker = "Yamaha RZ350";
        m.color = "Yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("--------");
        System.out.println("Starting engine...");

        System.out.println("--------");
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("--------");
        System.out.println("Starting engine...");
        m.startEngine();
    }
}