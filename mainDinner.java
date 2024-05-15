public class mainDinner {
    public static void main(String[] args){
        Dinner noodlesDinner = new Dinner();
        //declaring BiangBiang as a noodle called biangBiang
        Noodle biangBiang = new BiangBiang();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");

    }
}
