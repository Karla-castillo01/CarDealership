import java.util.Date;

public abstract class BusinessContract {
    private Date date;
    private String customerName;
    private String customerEmail;
    private boolean isSold;
    private double totalPrice;
    private double monthlyPayment;
    Vehicle vehicle;

    BusinessContract(
        Vehicle vehicle,
        Date date,
        String customerName,
        String customerEmail,
        boolean isSold,
        double totalPrice
    ) {
     this.vehicle = vehicle;
     this.date = date;
     this.customerName = customerName;
     this.isSold = isSold;
     this.totalPrice = totalPrice;
    }
    public String toString(){
        return String.format("""
        %s
        %s
        %s
        %s
        %s
        %s
        """,
        this.date,
        this.customerName,
        this.isSold ? "YES": "NO",
        this.totalPrice,
        this.monthlyPayment
        );
    }
    public Date getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public boolean isSold() {
        return isSold;
    }

    abstract double getTotalPrice();
    abstract double getMonthlyPayment();


}


//        public static void main(String[] args) {
//      BusinessContract bc = new BusinessContract(
//           new Date(),
//         "Karla Castillo",
//          "Karlacastbg03@gmail.com",
//          true,
//          10000.00,
//          500.00
//      );
//         System.out.println(bc);
//}

