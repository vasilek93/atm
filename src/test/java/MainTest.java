import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    private static final String PIN = "1234";
    @Test
    public void testCheckPin() throws Exception {
        Injector injector = Guice.createInjector(new TestModule());
        Atm atm = injector.getInstance(Atm.class);

        atm.checkPin();
    }

    static class DisplayImplMock extends DisplayImpl {
        @Override
        public String getPin() {
            return PIN;
        }
    }

    static class CardReaderImplMock extends CardReaderImpl {
        @Override
        public Card getCard() {
            Card card = new Card();
            card.setPin("1234");
            Assert.assertEquals(card.getPin(), PIN);
            return card;
        }
    }


    public class TestModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(Display.class).to(DisplayImplMock.class);
            bind(CardReader.class).to(CardReaderImplMock.class);
            bind(Input.class).to(InputImpl.class);
            bind(Output.class).to(OutputImpl.class);
            bind(ServerConnection.class).to(ServerConnectionImpl.class);
        }
    }

}
