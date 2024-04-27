import java.util.ArrayList;

public class Forloops {
    public static void main(String[] args){
        
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        //iterate over arraylist of expensies
        for(int i=0; i<expenses.size(); i++){
            total += expenses.get(i);
        }
        System.out.println(expenses);
        System.out.println(total);

        //foreach - enhanced for loops iterate thru without specifying size
        double mostExpensive = 0;
        //expense is like "i"and ":" is "in....for each i in expenses
        for(double expense: expenses){
            if(expense > mostExpensive){
                mostExpensive = expense;
            }
        }System.out.println(mostExpensive);
    }
}
