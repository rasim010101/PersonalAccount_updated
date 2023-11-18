import org.openjfx.InsufficientBalanceException;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            PersonalAccaunt r = new PersonalAccaunt(2312, "Erbol");
            r.deposit(23000);
            r.withdraw(32000);
            System.out.println(r.getBalance());
            System.out.println(r.getAccountHolder());
            System.out.println(r.getAccountNumber());
            r.printTransactionHistory();
        }
        catch (InsufficientBalanceException e){
            System.out.println("You don't have that much money!!");
//            System.out.println(e.toString());
        }

    }
}
