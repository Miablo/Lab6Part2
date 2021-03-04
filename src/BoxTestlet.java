/**
 * BoxTestlet implements Testlet
 * used to test Box class
 *
 * @version 1.0
 * @author Mio Diaz, Cody Walker
 */
public class BoxTestlet implements Testlet {
    Box b = new Box();
    /*
      Boundary Value Analysis for the two classes
      Minimum - 1
      Min+ - 2
      Nom - 5
      Max- 9
      Max - 10
       */
    @Override
    public void runTest(MyJUnit myJU) {
        if(myJU.checkBounds(2) && myJU.checkBounds(2) && myJU.checkBounds(2)) {
            if(myJU.checkEqual(b.getVolume(2, 2, 2), 8)){
                System.out.println("Width 2, Length 2, and Height 2 passed with 8");
            }else{
                System.out.println("Width 2, Length 2, and Height 2 failed with " + b.getVolume(2,2,2) + "expected 8.");
            }
        }else{
            System.out.println("Out of range width, length, and height needs to be between 1 - 10.");
        }
    }
}
