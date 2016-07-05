/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public interface Display {
    String getUserPin();

    String getOperation();

    double getWithdrawAmount();

    String showError(String error);

}
