//parent class where traits are inherited by child class (spaghetti)

public class NoodleInherit{
    //instances
    //protected means only child and parent classes can access
    protected double length;
    protected String shape;
    protected String texture = "brittle";
    protected String ingredients;
    protected double width;

    //constuctor
    public NoodleInherit(double len, double width, String shp, String ingr){
        this.length = len;
        this.width = width;
        this.shape = shp;
        this.ingredients = ingr;
    
    }

    public void cook(){
        this.texture = "al dante";
    }

    //final means child classes cannot change this method
    protected final boolean isTasty(){
        return true;
    }

    public static void main(String[] args){
        /* 
        SpaghettiInherit spaghettiPomodoro = new SpaghettiInherit();
        System.out.println(spaghettiPomodoro.texture); //brittle
        */
        PhoInherit phoChay = new PhoInherit();
        System.out.println(phoChay.shape); //Child PhoInherit also inherits the constructor frm Noodle after super call
        System.out.println(phoChay.isTasty());

    }
    
}