public class ATM {
    //static methods cannot interact with normal variables. only static-static
    //static variables to monitor all atms
    public static int numsATM = 0;
    public static int totalMoneyInATM = 0;

    //instances
    public int money;

    public ATM(int inputMoney){
        this.money = inputMoney;
        
        //when new atm created, atm counter and total money increases static var
        numsATM += 1;
        totalMoneyInATM += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(this.money >= amountToWithdraw){
            this.money -= amountToWithdraw;
            
            //decrease money in total money counter static var
            totalMoneyInATM -= amountToWithdraw;
        }else{
            System.out.println("There is insufficient balance is your account.");
        }
    }

    public static void averageMoney(){
        System.out.println(totalMoneyInATM / numsATM); //both are static variables so can be divided.
        //System.out.println(this.money); error as it is not static
    }

    public static void main(String[] args){
        //before adding ATMs
        System.out.println("The total number of ATMs now is: " + numsATM);
        System.out.println("The total amount of money across all ATMs is: $" + totalMoneyInATM);

        //after adding ATMs
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(20000);
        System.out.println("The total number of ATMs now is: " + numsATM);
        System.out.println("The total amount of money across all ATMs is: $" + totalMoneyInATM);
        
        firstATM.withdrawMoney(200);
        secondATM.withdrawMoney(10000);
        System.out.println("After withdrawal, the total amount of money across all ATMs is: $" + totalMoneyInATM);

        //calling average money static function
        averageMoney();


    }
}
