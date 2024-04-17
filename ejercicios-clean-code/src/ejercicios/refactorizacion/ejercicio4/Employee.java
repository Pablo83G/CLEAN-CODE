package ejercicios.refactorizacion.ejercicio4;

public class Employee {
    // ATRIBUTOS CLASE EMPLOYEE
    private double yearSalary;
    private double awards;
    private ISalaryCalculator salaryCalculator;

    // CONSTRUCTORES
    public Employee(){}

    public Employee(double yearSalary, double awards){
        this.yearSalary = yearSalary;
        this.awards = awards;
    }

    public Employee(double yearSalary, double awards, ISalaryCalculator salaryCalculator){
        this.yearSalary = yearSalary;
        this.awards = awards;
        this.salaryCalculator = salaryCalculator;
    }

    // GETTER AND SETTER
    public double getYearSalary() {
        return yearSalary;
    }

    public void setYearSalary(double yearSalary) {
        this.yearSalary = yearSalary;
    }

    public double getAwards() {
        return awards;
    }

    public void setAwards(double awards) {
        this.awards = awards;
    }

    // MÉTODO TOSTRING PARA PRESENTAR POR PANTALLA
    public String toString() {
        return "Year salary: " + yearSalary + "\n" +
                "Awards: " + awards + "\n" +
                "Month salary: " + salaryCalculator.monthlySalary(yearSalary, awards);
    }

}
