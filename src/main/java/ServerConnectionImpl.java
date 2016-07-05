/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class ServerConnectionImpl implements ServerConnection {

    private double balance;
    private String name;

    public ServerConnectionImpl(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }


    @Override
    public double getBalance() {
        return balance;
    }


    @Override
    public void updateBalance(double amount) {
        balance+=amount;
    }


}
