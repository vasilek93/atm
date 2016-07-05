
public class Atm {
    CardReader cardReader;
    Display display;
    Output output;
    Input input;
    ServerConnection serverConnection;

    public void insertCard(){
        cardReader.waitForCard();
    }


    public boolean checkPin(){
        Card card = cardReader.getCard();
        String userPin = display.getUserPin();
        if (userPin.equals(card.getPin()))
            return true;
        else
            return false;
    }

    public String selectOperation(){
        String operation = display.getOperation();
        return operation;
    }

    public double selectWithdrawlAmount(){
        double amount = display.getWithdrawlAmount();
        return amount;
    }

    public boolean checkAmount(){
        double availableAmount = serverConnection.getAvailableAmount();
        if (selectWithdrawlAmount() < availableAmount)
            return true;
        else
            return false;
    }

    public String showError(){
        String s1 = display.getError();
        return s1;
    }










}
