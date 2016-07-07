import com.google.inject.Inject;

public class Atm {

    @Inject
    CardReader cardReader;
    @Inject
    Display display;
    @Inject
    Output output;
    @Inject
    Input input;
    @Inject
    ServerConnection serverConnection;

    @Inject
    public Atm(CardReader cardReader, ServerConnection serverConnection, Input input, Output output, Display display) {
        this.cardReader = cardReader;
        this.serverConnection = serverConnection;
        this.input = input;
        this.output = output;
        this.display = display;
    }

    public void insertCard() {
        cardReader.waitForCard();
    }


    public boolean checkPin() {
        Card card = cardReader.getCard();
        String userPin = display.getPin();
        if (userPin.equals(card.getPin())) {
            System.out.print("Your pin is correct!");
            return true;
        }
        else
            return false;
    }

    public String selectOperation() {
        String operation = display.getOperation();
        return operation;
    }

    public double selectWithdrawAmount() {
        double amount = display.getWithdrawAmount();
        return amount;
    }

    public boolean checkAmount() {
        double availableAmount = serverConnection.getBalance();
        if (selectWithdrawAmount() < availableAmount)
            return true;
        else
            return false;
    }

    public double getAvailableAmount(){
        return serverConnection.getBalance();
    }


    public String showError(String error) {
        String s1 = display.showError(error);
        return s1;
    }

    public void withdraw() {
        serverConnection.updateBalance(-display.getWithdrawAmount());
        output.withdraw(display.getWithdrawAmount());

    }

    public void addMoney() {
        serverConnection.updateBalance(input.insertMoney(display.getWithdrawAmount()));

    }

    public void askForPin() {
        display.askForPin();
    }

    public void askForOperation() {
        display.askForOperation();
    }

    public void askForAmount() {
        display.askForAmount();
    }
}

