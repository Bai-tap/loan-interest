public class LoanInterest {
    public static double caculateInterest(double loans, double interest_rate, double range) {
        return loans * ((interest_rate + range) / 12);
    }

    public static void main(String[] args) {
        double loans = 6000;
        double interest_rate = 0.075;
        double months = 60;
        double range;

        double capital = loans / months;
        System.out.println("Principal pay in " + months + " months: " + capital);
    }
}
