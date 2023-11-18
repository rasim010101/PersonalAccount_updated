
import org.openjfx.InsufficientBalanceException;

import java.util.ArrayList;

public class PersonalAccaunt {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<Amount>();

    public PersonalAccaunt(int accountNumber, String accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
        
    }
    public void deposit(double amount){
        this.balance = this.balance+amount;
        Amount a = new Amount(amount, "deposit");
        this.transactions.add(a);
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
            if(this.balance < amount){
                throw new InsufficientBalanceException("You don't have that much money!!!");
            }
            this.balance = this.balance - amount;
            Amount a1 = new Amount(amount, "withdraw");
            this.transactions.add(a1);
    }
    public void printTransactionHistory(){
        for (int i = 0; i<transactions.size();i++){
            System.out.println(transactions.get(i).getAmount());
            
        }
        
    }
    public double getBalance(){
        return(this.balance);
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }

}
