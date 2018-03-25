package test.main; 

import main.TriangleProblem;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
/** 
* TriangleProblem Tester. 
* 
* @author <Authors name> 
* @since <pre>三月 22, 2018</pre> 
* @version 1.0 
*/
@RunWith(Parameterized.class)
public class TriangleProblemTest {
    private int input1;
    private int input2;
    private int input3;
    private boolean expected;
    private TriangleProblem tri = null;
public TriangleProblemTest(int input1,int input2,int input3,boolean expected){
    this.input1 = input1;
    this.input2 = input2;
    this.input3 = input3;
    this.expected = expected;
}
@Before
public void before() throws Exception {
    tri = new TriangleProblem(input1,input2,input3);
}
@Parameterized.Parameters
public static Collection<Object[]> getData(){
    return Arrays.asList(new Object[][]{
            {2,2,3,true},
            {3,3,3,true},
            {0,1,1,false},
            {10,2,3,false}
    });
}
@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getA() 
* 
*/ 
@Test
public void testGetA() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setA(int a) 
* 
*/ 
@Test
public void testSetA() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getB() 
* 
*/ 
@Test
public void testGetB() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setB(int b) 
* 
*/ 
@Test
public void testSetB() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getC() 
* 
*/ 
@Test
public void testGetC() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setC(int c) 
* 
*/ 
@Test
public void testSetC() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: isTriangle() 
* 
*/ 
@Test
public void testIsTriangle() throws Exception {
//TODO: Test goes here...
    assertEquals(this.expected,tri.isTriangle());
} 

/** 
* 
* Method: Available() 
* 
*/ 
@Test
public void testAvailable() throws Exception { 
//TODO: Test goes here... 
}
    
} 
