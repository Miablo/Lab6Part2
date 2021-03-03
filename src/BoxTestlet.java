import javax.swing.*;

/**
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class BoxTestlet implements TestletIF{
    Box b = new Box();
    @Override
    public void runTest() {
        b.getVolume(2,2,2);
    }
}
