
package Exception2;

public class Lab4 {
    
     public static void main(String[] args) {
        
        try {
            System.out.println("statement1");
            System.out.println("statement2");
            System.out.println("statement3");

        } catch (ArithmeticException ex1) {
            
        } catch (Exception ex2){
            throw ex2;
        }finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
        
        
    }
    
}
