public class Car{
    //instances
    String brand;
    int age;
    
    //constructor
    public Car(String carBrand, int carAge){
        brand = carBrand;
        age = carAge;
    }

    //method sorta like a function?
    public void startEngine(){
        //engineMessage cannot be used in main functions too
        String engineMessage = "The car is a " + age + " year old " + brand + "!";
        System.out.println("car is starting....Vvvvroooom " + engineMessage);
    }
    
    
    public static void main(String[] args){

        //myCarBrand and myCarAge are locally declared vars and cant be used anywhere else eg in startEngine
        String myCarBrand = "Honda";
        int myCarAge = 10;
        Car mine = new Car(myCarBrand, myCarAge);
        System.out.println(mine.brand);
        mine.startEngine();

    }
}
