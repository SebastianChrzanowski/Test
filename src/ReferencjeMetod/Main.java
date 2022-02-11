package ReferencjeMetod;

import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        Object objectInstance = new Object();
        IntSupplier equalsMethodOnObject = objectInstance::hashCode;
        System.out.println(equalsMethodOnObject.getAsInt());

        /*
        porownujemy do:
        Object objectInstance = new Object();
System.out.println(objectInstance.hashCode());

         */
    }
}
