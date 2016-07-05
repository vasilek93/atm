public class ServerConnectionImpl implements ServerConnection {

    private double balance = 200;
    private String name;


    @Override
    public double getBalance() {
        System.out.print("Your balance before operation is:" + balance);
        return balance;
    }


    @Override
    public void updateBalance(double amount) {
        balance+=amount;
        System.out.print("Your balance after operation is:" + balance);
    }


}
