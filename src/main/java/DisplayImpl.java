/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class DisplayImpl implements Display {

    private String operation;

    @Override
    public String getUserPin() {
        System.out.println("You entered pin: 1234");
        return "1234";
    }

    @Override
    public String getOperation() {
        System.out.println("Selected operation is: Give Money");
        return "Give Money";
    }

    @Override
    public double getWithdrawAmount() {
        double amount = 50;
        System.out.println("You want to get: "+amount + " eur");
        return amount;
    }


    @Override
    public String showError(String error) {
        System.out.println(error);
        return error;
    }
}
