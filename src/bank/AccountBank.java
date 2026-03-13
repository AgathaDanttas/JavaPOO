package src.bank;

public class AccountBank {
    private int numberAccount;
    private String titular;
    private double balance = 0;

    public AccountBank (int numberAccount, String titular, double balance){
        this.numberAccount = numberAccount;
        this.titular = titular;
        this.balance = balance;
    }

    public void deposit(double value){
        this.balance += this.balance + value;    
        System.out.println("Valor depositado com sucesso!"); 
        System.out.println("Saldo Atual: "+this.balance); 
    }

    public void withDraw (double value){
        this.balance = this.balance - value;
    }

    public void visualiteBalance(){              
            System.out.println(this.balance);
    }
}
