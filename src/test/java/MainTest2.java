import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainTest2 {

    private static final double AMOUNT = 200;

    @InjectMocks
    Atm atm;
    @Mock
    Input input;
    @Mock
    ServerConnection serverConnection;
    @Mock
    Display display;

    @Test
    public void testAddMoney() throws Exception {

        when(display.getWithdrawAmount()).thenReturn(AMOUNT);
        when(input.insertMoney(AMOUNT)).thenReturn(AMOUNT);
        atm.addMoney();
        verify(serverConnection).updateBalance(AMOUNT);

    }
}
