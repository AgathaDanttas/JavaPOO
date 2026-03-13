package src.employee;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double calculateSalaryNet() {
        return this.grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double increase;
        increase = grossSalary * (percentage /100.00);
        this.grossSalary += increase;
    }

    public void displayData() {
        System.out.println("Name: " + this.name);
        System.out.println("Salario Bruto: " + this.grossSalary);
        System.out.println("Imposto: " + this.tax);
        System.out.println("Salario Liquido: " + calculateSalaryNet());

    }

    public double getGrossSalary(){
        return this.grossSalary;
    }
}
