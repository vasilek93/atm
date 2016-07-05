/**
 * Created by pavel.grigoryev on 7/5/2016.
 */
public class OutputImpl implements Output {

    @Override
    public void withdraw(double amount) {

        System.out.println("Take your "+ amount + " eur!");
    }
}
