public class LoanInterest {
    public static double caculateInterest(double loans, double interest_rate, double range) {
        return loans * ((interest_rate + range) / 12);
    }
}
