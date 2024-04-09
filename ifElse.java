public class ifElse{

    public static void main(String[] args){
        double temp = 20.4;
        boolean raining = true;

        if(temp < 21){
            System.out.print("It might rain today!\n");
            if(raining == true){
                System.out.println("Bring your umbrella");
            }else{
                System.out.println("No need to bring umbrella");
            }
        }

        //if else statement is short, can omit paranthesis
        // if(hello == true) System.out.println("ok");
        // if, if else, else
    }
}
