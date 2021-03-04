import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * Main class
 * program driver - calls main method
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 *
 * @see java.lang.reflect.Method
 * @see java.lang.reflect.InvocationTargetException
 */
public class Main {
    /**
     * Main method
     *
     * @param args Name of classes object
     */
    public static void main(String[] args) {
        // JUnit object
        MyJUnit myJU = new MyJUnit();
        try {
            // Loop through arguments passed through CLI
            for (String arg : args) {
                Object o = Class.forName(arg).getConstructor().newInstance();
                Method m = o.getClass().getDeclaredMethod("runTest", MyJUnit.class);
                m.invoke(o, myJU);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

