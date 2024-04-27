public class BreaknCont {
    public static void main(String[] args){
        for(int i=0; i<100; i++){
            if (i%5 != 0){
                continue;
            }System.out.println(i);
            if (i >=50){
                break;
            }
        }
    }
}//printing out numbers divisible by 5
//stops after 50
