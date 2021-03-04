/**
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class MyJUnit extends TestHarness {

    /*
    (5 pts) Develop a JUnit like test tool MyJUnit that extends class TestHarness.

    Assume all input variables should range between 1 and 10.
    Perform boundary value analysis for the two classes through the two testlets.
     */
    public boolean checkBounds(int b){
        if(b >= 1 && b <= 10){return true;}
        else{return false;}
    }
    public boolean checkBounds(double b){
        if(b >= 1 && b <= 10){return true;}
        else{return false;}
    }

}
