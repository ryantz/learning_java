public class This_savings{

    //declaring instances / gobal variables use priv or pub
    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    public This_savings(String user, int balance){
        //init
        this.balanceDollar = balance;
        this.balanceEuro = balance * 0.85;
        this.owner = user;
    }

    public void addMoney(int addDollar){
        System.out.println("The amount to be added is: $" + addDollar + " to the current balance of: $" + this.balanceDollar);
        this.balanceDollar += addDollar;
        System.out.println("The new balance in your account is: $" + this.balanceDollar);
    }

    public static void main(String[] args){
        This_savings newAcc = new This_savings("ryan", 300);
        newAcc.addMoney(33);
        System.out.println(newAcc.balanceEuro);

    }
}
