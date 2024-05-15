public class Noodle{
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCen, double wthInCen, String shp, String ingr){
        this.lengthInCentimeters = lenInCen;
        this.widthInCentimeters = wthInCen;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook(){
        System.out.println("Boiling.");
        this.texture = "cooked";
    }
}