/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subtraction;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Екатерина
 */
public class TestSubtraction {
    @Test(expected = Exception.class)
    public void testSub(){
        op_subtraction val1 = new op_subtraction(3);
        op_subtraction val2 = new op_subtraction(3);
        op_subtraction exp = new op_subtraction(0);
        op_subtraction res = val1.sub(val2);
        
        
        assertEquals(res,exp);
        assertEquals(new op_subtraction(4).sub(new op_subtraction(5)),new op_subtraction(-1));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
}
