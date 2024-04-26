public class newMain {
    public static void main(String[] args) {
        // bankAccount account1 = new bankAccount(1000);
        // account1.deposit(10000);
        // account1.withdraw(7000);
        // System.out.println(account1.getBalance());

        developer newDev = new developer();
        desktop hpDesktop = new desktop();
        laptop hpLaptop = new laptop();
        newDev.writeCode(hpLaptop);
    }
}
