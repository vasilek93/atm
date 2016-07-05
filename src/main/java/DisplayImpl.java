import java.util.Scanner;

public class DisplayImpl implements Display {

    private String pin;
    private String operation;
    private double amount;


    @Override
    public String getPin() {
        return pin;
    }

    @Override
    public String getOperation() {
        return operation;
    }

    @Override
    public double getWithdrawAmount() {
        return amount;
    }


    @Override
    public String showError(String error) {
        System.out.println(error);
        return error;
    }

    @Override
    public void askForPin() {
        System.out.print("Please enter Your pin: ");
        Scanner s = new Scanner(System.in);
        pin = s.next();
        System.out.println("You entered pin: "+ pin);
    }

    @Override
    public void askForOperation() {
        System.out.print("Please enter Your operation: ");
        Scanner s = new Scanner(System.in);
        operation = s.nextLine();
        System.out.println("Selected operation is:" + operation);
    }

    @Override
    public void askForAmount() {
        System.out.print("Please enter amount You want to get/add: ");
        Scanner s = new Scanner(System.in);
        amount = Double.parseDouble(s.nextLine());
        System.out.println("You want to get/add: " + amount);
    }


}
