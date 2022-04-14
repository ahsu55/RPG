package main.java.designpatterns;






public class DesignPatterns {
    
    
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
        
        DesignPatterns a = new DesignPatterns();
        a.hello();
      
    }
}
