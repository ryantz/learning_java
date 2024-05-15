public class Spaetzle extends Noodle{
    Spaetzle(){
        super(3.0,1.5,"irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";
    }
    
    //overrideing cook() method in Noodle
    @Override
    public void cook(){
        System.out.print("Boiling.");
    }
}
