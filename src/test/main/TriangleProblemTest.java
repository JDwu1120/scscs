package test.main; 

import main.TriangleProblem;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;
/** 
* TriangleProblem Tester. 
* 
* @author <Authors name> 
* @since <pre>三月 22, 2018</pre> 
* @version 1.0 
*/ 
public class TriangleProblemTest {
    private TriangleProblem tri;
@Before
public void before() throws Exception {
    tri = new TriangleProblem(2,3,3);
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
    assertTrue(tri.isTriangle());
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
