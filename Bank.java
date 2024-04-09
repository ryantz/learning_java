public class Bank{
    //instance
    double balance;

    //constructor
    public Bank(double userBalance){
        balance = userBalance;
    }

    //reassigning instance fields
    public void withdrawAmount(double withdrawal){
        double updatedBalance = balance - withdrawal;
        balance = updatedBalance; //reassign
        System.out.println("The new amount after withdrawal is: $" + updatedBalance);
    }

    public void depositAmount(double deposit){
        double updatedBalance = balance + deposit;
        balance = updatedBalance; //reassign
        System.out.println("The new amount after depositing is: $" + updatedBalance);
    }

    public double savingsInterest(){
        double totalWithInterest = balance + balance * 0.01;
        return totalWithInterest; //returns a value to savingsInterest to be displayed
    }

    //helps return something with more information on the object created rather than just its memory address
    public String toString(){
        return "the balance in the account at the end of the transactions is $" + balance; //printing objects
    }
    public static void main(String[] args){
        Bank newAccount = new Bank(300.00);
        System.out.println("The current balance in the bank is: $" + newAccount.balance);
        newAccount.withdrawAmount(100);
        newAccount.depositAmount(400.20);
        double checkInterest = newAccount.savingsInterest();
        System.out.println("The total balance including interest is: $" + checkInterest);
        System.out.println(newAccount); //able to print out more info with the help of toString method
        //without toString, it will just print out the address the object is stored
    }
}