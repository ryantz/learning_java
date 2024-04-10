//import java.util.Arrays;
public class Arrays {
    public static void main(String[] args){
        //initializing an array
        double[] price = {13.1, 3.1, 30.9, 20.4};

        //changing values in an array
        price[3] = 20.44;
        System.out.println(price[3]);
        
        //creating an empty array
        String[] newitems = new String[5];
        //size of arrays cannot be changed once declared;
        //default items are int:0 double:0.0 String:null boolean:false

        //returning length of array
        System.out.println(newitems.length); //5

        //String[] args
        System.out.println("hello " + args[0]); // java Arrays <name>

        //if(args[0].equals(33)) if input arg = 33

        
        
    }
}
