public class Switch{
    
    public static void main(String[] args){
        String subject = "no";

        switch(subject){
            case "English":
                System.out.println("English enrolled");
                break;

            case "Maths":
                System.out.println("Maths enrolled");
                break;
            
            case "Science":
                System.out.println("Science enrolled");
                break;

            default:
                System.out.println("No subject entered!");
                
        }
    }
}