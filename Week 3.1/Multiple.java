public class Multiple {
    public static void main(String[]args){
        try{
            int a=10/0;
            int[]arr={10,20,30,40};
            System.out.println(arr[6]);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        }
    }
    

