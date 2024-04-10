public class ConditionalOps{

    public static void main(String[] args){
        boolean t = true;
        boolean f = false;
        boolean hello = true;
        
        //if there is a 0, it will b 0
        //if cond 1 is met but cond 2 is not, statement is false
        System.out.println(t && f); //false
        System.out.println(f && t); //false
        System.out.println(f && f); //false
        System.out.println(t && t); //true

        //if cond1 is met but cond2 is not, statement is still true
        System.out.println(t || f); //true
        System.out.println(f || t); //true

        
        if(!hello){
            System.out.println("nohello");
        }
        
        //combining conditional operators
        //hierachy of execution: () -> ! -> && -> ||
        boolean foo = true && !(false || !true);
        System.out.println(foo); //true
        


    }
}