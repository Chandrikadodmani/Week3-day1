public class Multi {
    public static void main(String[]args){
        try{
            int a=10/0;
            int[]arr={7,8,9,2};
            System.out.println(arr[5]);
        }catch(ArithmeticException |ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured");
        }
    }
    
}
