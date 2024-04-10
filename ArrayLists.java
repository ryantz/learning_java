// arrays are fixed sizes and cannot add anything outside of the declared size
//in order to have array list, need to import
import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args){
        //declaring and initializing an arraylist
        //ArrayList<type> name = new ArrayList<type>();
        //types: String, Integer, Double, Character 
        ArrayList<Integer> nameof = new ArrayList<Integer>();

        nameof.add(1);
        nameof.add(2);
        nameof.add(3);
        nameof.add(4);
        nameof.add(5);

        nameof.add(0, 0); //adding 0 at index 0

        System.out.println(nameof);
        int sizeof = nameof.size();

        System.out.println(sizeof); //6

        //getting index in an array list is different from an array
        //a method needs to be used

        System.out.println(nameof.get(3)); //index 3 = 3

        //changing values in Arraylist also used a method of .set
        nameof.set(0, 10); //changing value at index 0 to 10
        System.out.println(nameof);

        //removing values
      //  nameof.remove("hehe") can specify values to remove too
        nameof.remove(0); //removing values 10 at index 0 from the Arraylist
        System.out.println(nameof);

        //getting index
        System.out.println(nameof.indexOf(3)); //2 [1,2,3...]


        //can declare an arraylist without a type, can store any type
        //but will not have access to the methods in arraylist like .add()

        
    }
}
