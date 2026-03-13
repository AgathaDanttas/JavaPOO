package src.student;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private double average;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double calculateAverage (){
        return this.average = (this.grade1 + this.grade2 + this.grade3)/3; 
    }

    public String verifyApproval (){
        double average = calculateAverage();
        String msg;

        msg = average >= 7 ? "Aprovado" : "Reprovado";
        return msg;
    }

    public String displayResult(){
        return verifyApproval();
    }

}
