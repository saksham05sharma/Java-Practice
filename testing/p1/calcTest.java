package testing.p1;
import org.junit.*;

public class calcTest {
    @Test
    public void test(){
        calc c = new calc();
        int res = c.division(10, 5);
        Assert.assertEquals(2, res);
    }
}
