public class Nested {
    public static void main(String[]args){
        try{
            try{
                int a=10/0;
                System.out.println(a);
            }catch(ArithmeticException e){
            System.out.println("Inner catch:ArithmeticException");
        }
    }
         catch (Exception e){
                System.out.println("Outer catch block is excuted");
         }    
        
    }
}  

