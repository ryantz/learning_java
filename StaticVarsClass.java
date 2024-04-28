public class StaticVarsClass {
    //static variables are constant throughout all methods.
    //dog genus are same for all dogs
    
    //static variables
    public static String genus = "Canis";

    //instances
    public int age;
    public String name;

    public StaticVarsClass(int inputAge, String inputName){
        this.age = inputAge;
        this.name = inputName;
    }

    public static void main(String[] args){
        StaticVarsClass doge1 = new StaticVarsClass(2, "Betty");
        StaticVarsClass doge2 = new StaticVarsClass(3, "Bob");
        
        System.out.println(doge1.age);
        System.out.println(doge1.name);
        System.out.println(doge2.age);
        System.out.println(doge2.name);
        System.out.println(StaticVarsClass.genus); //dog gene
        
    }
    
}
