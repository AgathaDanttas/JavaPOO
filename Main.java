//import src.student.*;
import src.Library.Book;
import src.Library.Library;

public class Main{
    public static void main(String args[]){
       //AccountBank account = new AccountBank(2001,"Agatha",20);
    
       //account.visualiteBalance();

       //Student student = new Student("Agatha",7,6,7);

       //Rectangle rec = new Rectangle(10.00, 10.00);

       //rec.displayPerimeterAndArea();

       //Employee employee = new Employee("Agatha", 1518, 20);

      // employee.displayData();
       //employee.increaseSalary(10);
      // System.out.println("Novo sálario: "+employee.getGrossSalary());
        
       //Product product = new Product("Biscoito",12,20);

      // product.displayData();

      Library library = new Library();
      Book book = new Book("Rosas", "Rafael Monteiro", 420);
      Book book2 = new Book("Diario Encantado", "Melissa Dantas", 540);

      System.out.println(library.addBook(book));
      System.out.println(library.addBook(book2));

      for(int i = 0; i <= 2; i++){
        System.out.println(library.listBooks());
        System.out.println("");
      }
    
      
      //Vetores
      int[] numeros = new int[10];
      for (int i = 0; i < 10; i++) {
          System.out.println("Informe o "+ i+ " numero:");
      }
    }
}