public class Strings{
    public static void main(String[] args){
        //ways to declare a string
        //notice double quotes and not single quotes like char
        String str = "hello this is a string";
        String str2 = new String("hello this is also a string");

        //escape characters \"  \\  \n
        String str3 = "\"this is to print quotes\"";
        String str4 = "\\this is to print slashes\\";
        String str5 = "This \n is \n a \n new \n line \n";


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}