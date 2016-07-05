
public class Atm {

    CardReader cardReader = new CardReaderImpl();
    Display display = new DisplayImpl();
    Output output = new OutputImpl();
    Input input;
    ServerConnection serverConnection;

    public void insertCard() {
        cardReader.waitForCard();
    }


    public boolean checkPin() {
        Card card = cardReader.getCard();
        String userPin = display.getUserPin();
        if (userPin.equals(card.getPin()))
            return true;
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


    public String showError() {
        String s1 = display.getError();
        return s1;
    }

    public void withdraw() {
        output.withdraw(display.getWithdrawAmount());
        serverConnection.updateBalance(-display.getWithdrawAmount());
    }

}

