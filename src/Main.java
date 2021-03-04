import java.lang.reflect.InvocationTargetException;

/**
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class Main {
    /*
    The problem is how to access the TestHarness object from your Testlet object.
    A good solution is to pass the TestHarness object to the Testlet's method. In that case,
    you can utilize the TestHarness object to do all sorts of comparison that are available in the TestHarness object.
     */

    /**
     * Main method
     *
     * @param args Name of classes object
     */
    public static void main(String[] args) {
        MyJUnit myJU = new MyJUnit();
        try {
            for (String arg : args) {
                // Now cast the object to a Testlet class.
                // With the Testlet object, you can run its method.
                Object o = Class.forName(arg).getConstructor().newInstance();
                // To print out objects created for test - can be removed //
                System.out.println("Object created for class:"
                        + o.getClass().getName());
                if(o.getClass().getName() == "BoxTestlet"){
                    BoxTestlet box = new BoxTestlet(); //just for test right now
                    box.runTest(myJU);
                }else if (o.getClass().getName() == "RectangleTestlet"){
                    RectangleTestlet rec = new RectangleTestlet();
                    rec.runTest(myJU);
                }
            }
            BoxTestlet box = new BoxTestlet(); //just for test right now
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

