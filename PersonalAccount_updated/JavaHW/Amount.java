

public class Amount {
    public double amount;
    public String transactionsType;


    public Amount(double amount, String type){
        this.amount = amount;
        this.transactionsType = type;
    }
    public String  getAmount(){

        return this.transactionsType + ": " + this.amount;
    }
}
