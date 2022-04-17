package test.java;

import static org.junit.Assert.assertEquals;

import main.java.rpg.Rpg;
import org.junit.Test;

//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;


//initial setup 
public class UnitTest {


    Rpg hello;
    
    /** Set up before runtime.
     * @author ahsu5
     */
    
    @org.junit.Before
    public void setUp() throws Exception {
        hello = new Rpg();
        
   

    }

    // sample test
    @Test
    public void hello() {
        assertEquals("Hello World", hello.hello());
      
    }

  
}