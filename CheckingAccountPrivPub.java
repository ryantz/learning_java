public class CheckingAccountPrivPub{
    //declare instances or features in checking account
    //making it private, bankprivpub cannot access
    private String name;
    private int balance;

    //constructor
    public CheckingAccountPrivPub(String userName, int userBal){
        name = userName;
        balance = userBal;
    }

    //method
    private void addFunds(int funds){
        balance += funds;
    }

    //getter method...take note this.name, this.balance
    public void getInfo(){
        System.out.println("This checking account belongs to " + this.name + ". It has: $" + this.balance + " in it.");
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    public static void main(String[] args){
        //creating a checkingacc to test if can work in this code
        CheckingAccountPrivPub newAcc = new CheckingAccountPrivPub("Ryan", 300);
        System.out.println(newAcc.name);
        System.out.println(newAcc.balance);
        newAcc.addFunds(30);
        System.out.println(newAcc.balance);
        //vars can be used in private class CheckingAcc but not in Bank code.

    }


}