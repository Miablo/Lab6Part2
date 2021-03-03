/*
 Here shows a sample snippet for RectangleTestlet. The ??? is an object used to run checkEqual.
 This object should be passed in not created by using the keyword “new”, such as new TestHarness(). In other words,
 the TestHarness object should be the same one that creates the Testlets instead of being a new object.
  */
/**
 *
 * @version 1.0
 * @author Mio Diaz,
 */
public class RectangleTestlet implements TestletIF {
    // The Rectangle class has a method int getArea(int w, int h),

    int getArea(int w, int h){
        return w * h;
    }
}
