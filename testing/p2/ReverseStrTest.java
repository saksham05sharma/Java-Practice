package testing.p2;

import org.junit.*;

public class ReverseStrTest {
    @Test
    public void test(){
        ReverseStr r = new ReverseStr();
        String res = r.reverseString("null");
        String expected = "llun";
        Assert.assertEquals(expected, res);
    }
}  
