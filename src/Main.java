/**
 *
 * @version 1.0
 * @author Mio Diaz,
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
       // Class c = Class.forName(args[0]);  // The args[0] would be “pkg.RectangleTestlet”
       // Object o = c.newInstance();
        // Now cast the object to a Testlet class.
        // With the Testlet object, you can run its method.
    }
}

