public class Resource {
    public static void main(String[]args){
        try{
            System.out.println("Resource is opened");
        }finally{
           System.out.println("Resource is Closed"); 
        }
    }
    
}
