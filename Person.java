public class Person{
    //declaring instances here or class' "features"
    String name;
    int age;
    double rating;
    char grade;

    public Person(String userName, int userAge){
        name = userName;
        age = userAge;
    }
    //able to decalre multiple constructors due to constructor overloading
    public Person(float userRating, char userGrade){
        rating = userRating;
        grade = userGrade;
    }

    public static void main(String[] args){
        Person bob = new Person("Bob", 21);
        bob.rating = 8.3;
        bob.grade = 'A';
        System.out.println(bob.name);
        System.out.println(bob.grade);
        

    }
}
