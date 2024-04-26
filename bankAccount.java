public class bankAccount {
    private int balance;

    public bankAccount(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("A deposit of " + amount + " was successful");
        }
        else {
            System.out.println("Invalid Amount !");
        }
    }
    public void withdraw(int amount){
        if (amount <= balance && amount > 0){
            this.balance -= amount;
            System.out.println("A withdrawal of " + amount + " was successful");
        }
        else {
            System.out.println("Invalid Amount !");
        }
    }

    public int getBalance(){
        return this.balance;
    }
}
