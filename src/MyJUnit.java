/**
 * MyJUnit extends TestHarness
 * used to run analysis on testlet classes
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class MyJUnit extends TestHarness {
    /*
    Boundary Value Analysis for the two classes
    Minimum
    Min+
    Nom
    Max-
    Max
     */

    /*
    (5 pts) Develop a JUnit like test tool MyJUnit that extends class TestHarness.

    Assume all input variables should range between 1 and 10.
    Perform boundary value analysis for the two classes through the two testlets.
     */
    public boolean checkBounds(int b){
        return b >= 1 && b <= 10;
    }
    public boolean checkBounds(double b){
        return b >= 1 && b <= 10;
    }

}
