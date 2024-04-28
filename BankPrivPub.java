public class BankPrivPub{
    //declare instances
    //instances are usually private as dont want users to know the exact name
    //to give access to private variables to other classes: getter methods
    //allowing other classes to reset value stored in private variables: setter methods (mutator)

    private CheckingAccountPrivPub acc1;
    private CheckingAccountPrivPub acc2;

    //constructor
    public BankPrivPub(){
        //new bank created will have these accounts in them
        acc1 = new CheckingAccountPrivPub("Bran", 10000);
        acc2 = new CheckingAccountPrivPub("Jam", 200);
    }

    public static void main(String[] args){
        //name , addFunds and getInfo cannot be accessed since it is private
        //to access, a getter method is created in CheckingAccount
        BankPrivPub newBank = new BankPrivPub();
        //System.out.println(newBank.acc1.name);
        newBank.acc1.setBalance(5000); //resetting variable value using mutator method setter.
        newBank.acc1.getInfo();
    }
}