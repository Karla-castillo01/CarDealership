import java.util.Date;

public class LeaseContract extends BusinessContract {
    private double expectedEndingValue;
    private double leaseFee;

    LeaseContract(
            /* ******** BASE ********* */
            Vehicle vehicle,
            Date date,
            String customerName,
            String customerEmail,
            boolean isSold,
            double totalPrice,
            /* ******** NEW ********* */
            double expectedEndingValue,
            double leaseFee
    ) {
        super(vehicle, date, customerName, customerEmail, isSold, totalPrice);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    public String toString() {
        return super.toString() + String.format("""
                        Expected Ending Value: %.2f
                        Lease Fee:    %.2f
                        """,
                this.expectedEndingValue,
                this.leaseFee
        );
    }

    double getTotalPrice() {
        return 0;
    }

    double getMonthlyPayment() {
        return 0;
    }
}
