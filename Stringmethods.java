public class Stringmethods {
    public static void main(String[] args){

        String str = "Hello, my name is";

        String intro = " Ryan";
        String lastname = "Tan";
        String name = "Tan";
        intro = str.concat(intro); //concat 2 strings
        String newstr = "There you lie in all your glory under the sun";

        //string methods
        System.out.println(str.length()); //length of string
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(6)); //start from index 6
        System.out.println(intro);
        System.out.println(str.equals(intro)); //false
        System.out.println(lastname.equals(name)); //true
        System.out.println(lastname.compareTo(name)); //0
        System.out.println(lastname.compareTo(str)); //T and H is 12 letters apart
        System.out.println(str.indexOf("name"));//10
        System.out.println(name.charAt(0)); //T
        System.out.println(newstr.substring(10)); //lie in all your glory under the sun
        System.out.println(newstr.substring(21,31)); //your glory. does not include 31 [21,31)
        
    }
}
