import static org.junit.Assert.*;
import org.junit.Test;

/*
javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" SkillDemonstrationTest.java SkillDemonstration.java
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore SkillDemonstrationTest
*/

public class SkillDemonstrationTest {
    @Test
    public void subtractTest() {
        assertEquals(2,SkillDemonstration.subtract(4,1)) ;
    }
}
