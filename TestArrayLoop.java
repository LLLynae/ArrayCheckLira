import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayLoop extends ArrayLoop{
    @Test
    public void testLoop(){

        assertTrue(getHighNum() >= getArray(0));

    }
    
}
