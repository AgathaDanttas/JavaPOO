//import src.student.*;
import src.rectangle.*;
import src.employee.Employee;
import src.product.Product;

public class Main{
    public static void main(String args[]){
       //AccountBank account = new AccountBank(2001,"Agatha",20);
    
       //account.visualiteBalance();

       //Student student = new Student("Agatha",7,6,7);

       Rectangle rec = new Rectangle(10.00, 10.00);

       rec.displayPerimeterAndArea();

       Employee employee = new Employee("Agatha", 1518, 20);

       employee.displayData();
       employee.increaseSalary(10);
       System.out.println("Novo sálario: "+employee.getGrossSalary());
        
       Product product = new Product("Biscoito",12,20);

       product.displayData();

    }
}