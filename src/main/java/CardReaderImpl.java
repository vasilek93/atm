import java.util.Scanner;

/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class CardReaderImpl implements CardReader{

    private Card card;
    private Scanner scan;

    @Override
    public void waitForCard() {
        System.out.println("Please insert your card...");

    }

    public boolean isCardIn(){
        System.out.println("Is card in? Y/N");
        scan = new Scanner(System.in);
        if (scan.equals("Y")){
            return true;
        }
        else
            return false;

    }

    @Override
    public Card getCard() {
        return card;
    }

    public void setCard(Card card){
        this.card=card;
    }
}
