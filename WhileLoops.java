import java.util.Random;

public class WhileLoops {
    public static void main(String args[]){

        //random number generator
        Random randomGenerator = new Random();
        //generate a number between 1 to 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        //repeat while the roll is not 5
        while(dieRoll != 5){
            System.out.println(dieRoll);
            //randomize again as the number does not keep changing
            dieRoll = randomGenerator.nextInt(6) + 1;
        }
    }
}
