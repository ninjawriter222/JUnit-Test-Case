package junittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author Poozer
 */
public class Message {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }
}
