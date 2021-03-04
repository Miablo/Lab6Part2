/*
 Here shows a sample snippet for RectangleTestlet. The ??? is an object used to run checkEqual.
 This object should be passed in not created by using the keyword “new”, such as new TestHarness(). In other words,
 the TestHarness object should be the same one that creates the Testlets instead of being a new object.
  */

/**
 * RectangleTestlet implements Testlet used to test
 * Rectanlge class
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class RectangleTestlet implements Testlet {
  Rectangle r = new Rectangle();

    @Override
    public void runTest(MyJUnit myJU) {
        if(myJU.checkBounds(5) && myJU.checkBounds(5)) {
            if(myJU.checkEqual(r.getArea(5, 5), 25)){
                System.out.println("Width 5 and Height 5 passed with 25");
            }else{
                System.out.println("Width 5 and Height 5 failed with " + r.getArea(5,5) + "expected 25.");
            }
        }else{
            System.out.println("Out of range length and height needs to be between 1 - 10.");
        }
    }
}
