import ejercicios.refactorizacion.ejercicio2.Address;
import ejercicios.refactorizacion.ejercicio2.DefaultFormatAddress;
import ejercicios.refactorizacion.ejercicio2.Human;
import ejercicios.refactorizacion.ejercicio2.IFormatAddress;
import ejercicios.refactorizacion.ejercicio1.Ejercicio1;
import ejercicios.refactorizacion.ejercicio3.CalculoMatematico;
import ejercicios.refactorizacion.ejercicio4.BasicSalaryCalculator;
import ejercicios.refactorizacion.ejercicio4.Employee;
import ejercicios.refactorizacion.ejercicio4.ISalaryCalculator;

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

        System.out.println(human.toString());
        System.out.println();

        // Comprobación Ejercicio 3
        CalculoMatematico calculoMatematico = new CalculoMatematico();

        calculoMatematico.calculoRaizCuadrada(1,5,2);
        System.out.println();
        calculoMatematico.calculoRaizCuadrada(8,2,2);
        System.out.println();

        // Comprobación Ejercicio 4
        ISalaryCalculator monthSalary = new BasicSalaryCalculator();
        Employee employee1 = new Employee(30000, 6000, monthSalary);

        System.out.println(employee1.toString());
        System.out.println();


    }

}