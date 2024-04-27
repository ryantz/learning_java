import java.util.ArrayList;

public class Removing{
    
    public static ArrayList<String> removeAnts(ArrayList<String> lunchbox){
        int i =0;
        while(i < lunchbox.size()){
            if(lunchbox.get(i)=="ants"){
                lunchbox.remove(lunchbox.get(i));
            }else{
                i++; //skip to next if no ants
            }
        }return lunchbox;

        /* 
        //for loop method
         for(i=0; i<lunchbox.size();i++){
            if(lunchbox.get(i) == "ants"){
                lunchbox.remove(lunchbox.get(i));
                i--; //decrement count as for loops still increments count
            }
         }return lunchbox;
         */
    }

    public static void main(String[] args){
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("Apple");
        lunchContainer.add("ants");
        lunchContainer.add("Cheese");
        lunchContainer.add("Pear");
        lunchContainer.add("ants");
        lunchContainer= removeAnts(lunchContainer);
        System.out.println(lunchContainer);

    }
}