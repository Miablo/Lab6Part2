/**
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class Main {

   /* The MyJUnit can accept multiple testlet class names, such as “java MyJUnit RectangleTestlet BoxTestlet”,
    to test testlet classes in order. Most importantly, the MyJUnit tool must be able to handle new testlet
    classes in the future without a need of code change.*/

    /*
    The problem is how to access the TestHarness object from your Testlet object.
    A good solution is to pass the TestHarness object to the Testlet's method. In that case,
    you can utilize the TestHarness object to do all sorts of comparison that are available in the TestHarness object.
     */

    public static void main(String[] args) {
       // Class c = null;  // The args[0] would be “pkg.RectangleTestlet”
        MyJUnit myJU = new MyJUnit();
        try {
           // c = Class.forName(args[0]);
            for(int i = 0; i < args.length; i++){
                Object o = Class.forName(args[i]).newInstance();
                // To print out objects created for test - can be removed //
                System.out.println("Object created for class:"
                        + o.getClass().getName());
            }
            //BoxTestlet box = new BoxTestlet(); //just for test right now
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        // Now cast the object to a Testlet class.
        // With the Testlet object, you can run its method.
    }
}

