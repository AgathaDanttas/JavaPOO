import src.AccountBank;
import src.Student;

public class Main{
    public static void main(String args[]){
       //AccountBank account = new AccountBank(2001,"Agatha",20);
    
       //account.visualiteBalance();

       Student student = new Student("Agatha",7,6,7);

       System.out.println(student.verifyApproval());
    }
}