
public class OutputImpl implements Output {

    @Override
    public void withdraw(double amount) {

        System.out.println("Take your "+ amount + " eur!");
    }
}

