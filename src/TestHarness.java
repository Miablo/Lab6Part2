/**
 * TestHarness used to compare
 * primitive data type values
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class TestHarness {

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
