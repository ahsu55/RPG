package src.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.main.java.Main;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;


//initial setup 
public class UnitTest {


    Main hello;
    
    /** Set up before runtime.
     * @author ahsu5
     */
    
    @org.junit.Before
    public void setUp() throws Exception {
        hello = new Main();
        
   

    }

    // sample test
    @Test
    public void hello() {
        assertEquals("Hello World", hello.hello());
      
    }

  
}