import org.connecting_ropes.Connecting_ropes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ConnectingRopesTest {

    private Connecting_ropes connectingRopes = new Connecting_ropes();

    @Test
    public void testarrayof4(){
        assertEquals(17, connectingRopes.min(new ArrayList<>(List.of(4,2,3,6))));
    }

    @Test
    public void testarrayempty(){
        assertEquals(0, connectingRopes.min(new ArrayList<>()));
    }

    @Test
    public void testarrayOneElement(){
        assertEquals(0, connectingRopes.min(new ArrayList<>(10)));
    }
}
