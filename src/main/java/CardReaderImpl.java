import java.util.Scanner;

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

        Card card = new Card();
        card.setName("Alina");
        card.setPin("1234");
        System.out.println("Card inserted!");

        return card;
    }

    public void setCard(Card card){
        this.card=card;
    }
}
