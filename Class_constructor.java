//basic skeleton of a class, declaring class name, accessibility (?)

public class Class_constructor{

    //creating a constructor / instructions for a class
    public Class_constructor(){
        System.out.println("I am inside the constructor");
    }
    public static void main(String[] args){

        Class_constructor something = new Class_constructor();
        System.out.println(something); //prints out memory location of something
    }
}