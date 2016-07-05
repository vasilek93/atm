/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class CardReaderImpl implements CardReader{


    @Override
    public void waitForCard() {
        System.out.print("Please insert your card...");
    }

    @Override
    public Card getCard() {
        Card card = new Card();
        card.setName("Alina");
        card.setPin("1234");
        return card;
    }
}
