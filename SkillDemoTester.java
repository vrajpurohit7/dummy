import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void average() {
        assertEquals(2, SkillDemo.avg(1,1));
    }
}