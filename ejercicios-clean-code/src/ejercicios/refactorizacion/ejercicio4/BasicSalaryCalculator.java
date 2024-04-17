package ejercicios.refactorizacion.ejercicio4;

public class BasicSalaryCalculator implements ISalaryCalculator {
    // Implementación del cálculo mensual
    @Override
    public double monthlySalary(double yearlySalary, double awards) {
        return (yearlySalary + awards)/12;
    }

}
