import ejercicios.refactorizacion1.ejercicio2.Address;
import ejercicios.refactorizacion1.ejercicio2.DefaultFormatAddress;
import ejercicios.refactorizacion1.ejercicio2.Human;
import ejercicios.refactorizacion1.ejercicio2.IFormatAddress;
import ejercicios.refactorizacion1.ejercicio1.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Comprobación Ejercicio 1
        Ejercicio1 ejercicio1 = new Ejercicio1();

        boolean result1 = ejercicio1.greaterThan(8, 3);
        System.out.println("El resultado de la prueba 1 es: " + result1);

        boolean result2 = ejercicio1.greaterThan(1, 3);
        System.out.println("El resultado de la prueba 2 es: " + result2);

        System.out.println();

        // Comprobación Ejercicio 2
        Address address = new Address();
        address.setCountry("España");
        address.setCity("Cádiz");
        address.setStreet("Calle Viva la Pepa");
        address.setHouse("1812");
        address.setQuarter("B");

        IFormatAddress iFormatAddress = new DefaultFormatAddress();

        Human human = new Human("Pablo", 41, address, iFormatAddress);

        System.out.println(human);

    }
}