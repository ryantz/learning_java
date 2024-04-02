public class Operators{
    public static void main(String[] args){
        // + - / * ++ -- % == != < > <= >= += -= *= /=
        int a = 6;
        int b = 3;
        int c = a + b;
        double d = a / b;
        int e = a * b;
        int mod = 25 % 3;

        boolean checkequal = a == b;

        String str1 = "Hello there";
        String str2 = "Hello there";
        String str3 = "my name is Ryan";
        //string concatenation
        String intro = str2 + " " + str3 + "!";

        //unchangable values or constants const enums
        final String str0 = "This string cannot be changed";
       // str0 = "hei"; //throws an error

        System.out.println(d);
        System.out.println(mod); //1
        System.out.println(checkequal); //false

        //for strings, == does not work consistently due to memory
        //.equals() is used instead

        System.out.println(str1.equals(str2));
        System.out.println(intro);





    }
}