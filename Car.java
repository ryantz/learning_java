public class Car{
    //instances
    String brand;
    int age;
    
    //constructor
    public Car(String carBrand, int carAge){
        brand = carBrand;
        age = carAge;
    }

    //method sorta like a function? to automate something that will be done many times
    public void startEngine(){
        //engineMessage cannot be used in main functions too
        String engineMessage = "The car is a " + age + " year old " + brand + "!";
        System.out.println("car is starting....Vvvvroooom " + engineMessage);
    }

    //methods can also accept parameters/args + same method twice due to method overload..same as constructors
    public void startRadio(double stationNumber, String stationName){
        System.out.println("Starting radio...the station number is " + stationNumber + " " + stationName +"!");
        System.out.println("Enjoy!!!");
    }

    public void startRadio(double stationNumber){
        System.out.println("Station number is " + stationNumber);
    }
    
    
    public static void main(String[] args){

        //myCarBrand and myCarAge are locally declared vars and cant be used anywhere else eg in startEngine
        String myCarBrand = "Honda";
        int myCarAge = 10;
        Car mine = new Car(myCarBrand, myCarAge);
        System.out.println(mine.brand);
        mine.startEngine();
        mine.startRadio(97.5,"Hit24");

    }
}
