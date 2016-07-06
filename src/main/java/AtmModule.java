import com.google.inject.AbstractModule;

public class AtmModule extends AbstractModule{


    @Override
    protected void configure() {

        bind(Display.class).to(DisplayImpl.class);
        bind(CardReader.class).to(CardReaderImpl.class);
        bind(Input.class).to(InputImpl.class);
        bind(Output.class).to(OutputImpl.class);
        bind(ServerConnection.class).to(ServerConnectionImpl.class);
    }
}
