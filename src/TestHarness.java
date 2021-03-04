/**
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class TestHarness {

    /*
      In TestHarness, there are two overloading methods boolean checkEqual(int actual, int expected)
     and boolean checkEqual(double actual, double expected) for comparing primitive data type values.
     */

    /**
     * overload function to check if it is expected value or not for int
     * @param actual is what formula gives back in TestLet
     * @param expected is what is expected value
     * @return  true if both match false otherwise
     */
    boolean checkEqual(int actual, int expected){
        return actual == expected;
    }

    /**
     * overload function to check if it is expected value or not for double
     * @param actual is what formula gives back in TestLet
     * @param expected is what is expected value
     * @return  true if both match false otherwise
     */
    boolean checkEqual(double actual, double expected){
        return actual == expected;
    }
}
