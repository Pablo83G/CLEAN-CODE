package ejercicios.refactorizacion.ejercicio3;

public class CalculoMatematico {
private double a;
private double b;
private double c;

    public void calculoRaizCuadrada(double a, double b, double c) {
        double numReferencia = b * b - 4 * a * c;
        if (numReferencia > 0) {
            double raiz1 = (-b - Math.sqrt(numReferencia)) / (2 * a);
            double raiz2 = (-b + Math.sqrt(numReferencia)) / (2 * a);
            System.out.println("La raiz 1 es = " + raiz1 + ", La raiz 2 es = " + raiz2);
        } else if (numReferencia == 0) {
            double raiz3 = -b / (2 * a);
            System.out.println("La raiz 3 es = " + raiz3);
        } else {
            System.out.println("La ecuacion no tiene raiz");
        }

    }
}
