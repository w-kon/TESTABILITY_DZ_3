public class CreditPaymentService{
    public double calculate (int credit, double bet, int years){
        double p = bet/12/100;
        double n = years*12;
        return (credit*((p*Math.pow(1+p,n))/(Math.pow(1+p,n)-1)));
    }
}
