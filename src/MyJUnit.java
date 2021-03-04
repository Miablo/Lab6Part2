/**
 * MyJUnit extends TestHarness
 * used to run analysis on testlet classes
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class MyJUnit extends TestHarness {
    /**
     * checkBounds
     * @param b integer from testlet class
     * @return true or false if within bounds
     */
    public boolean checkBounds(int b){
        return b >= 1 && b <= 10;
    }

    /**
     *
     * @param b double from testlet class
     * @return true or false if within bounds
     */
    public boolean checkBounds(double b){
        return b >= 1 && b <= 10;
    }

}
