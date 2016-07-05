
public class Atm {
    CardReader cardReader;
    Display display;
    Output output;
    Input input;


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

    public Operation selectOperation(){
        Operation operation = display.getOperation();
        return operation;
    }

    public double selectWithdrawlAmount(){
        double amount = display.getWithdrawlAmount();
        return amount;
    }
    


}
