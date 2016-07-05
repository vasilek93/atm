/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public interface Display {
    String getPin();

    String getOperation();

    double getWithdrawAmount();

    String showError(String error);

    public void askForPin();

    public void askForOperation();

    public void askForAmount();

}
