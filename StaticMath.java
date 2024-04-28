//import static java.lang.Math -> no need to declare Math. in code.

//static means you dont need to create a new object to use it
//no need to create Math name = new Math()
//directly call with dot operater Math.
//static variables are like global variables and cannot be changed

public class StaticMath {
    public static void main(String[] args){
        //random number *number = number of values to randomize, +number = starting value
        //in range 3 to 8 (6 values: 3 4 5 6 7 8 [*6]) (start from 3 [+3])
        int x = (int)(Math.random() * 6) + 3;
        System.out.println(x);
    }
}
