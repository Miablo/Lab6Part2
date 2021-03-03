/*
 Here shows a sample snippet for RectangleTestlet. The ??? is an object used to run checkEqual.
 This object should be passed in not created by using the keyword “new”, such as new TestHarness(). In other words,
 the TestHarness object should be the same one that creates the Testlets instead of being a new object.
  */

import java.awt.*;

/**
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 * @version 1.0
 */
public class RectangleTestlet implements TestletIF {
  Rectangle r = new Rectangle();
    @Override
    public void runTest() {
        r.getArea(5,5);
    }
}
