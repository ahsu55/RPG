package main.java.rpg;






public class Rpg {
    
    
    /** initial setup.
     *  
     * @return hello world
     */
    public String hello() {
        String testing = "Hello World";
        System.out.println(testing);
        return testing;
    }
    
    /**main class.
     * 
     * @param args arguments
     */
    public static void main(String[] args) {
        
        Rpg a = new Rpg();
        a.hello();
      
    }
}
