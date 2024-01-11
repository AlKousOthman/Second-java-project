import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Employee othman = new Employee(83224, "othman", "developer", 700.0);

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        Calendar date3 = Calendar.getInstance();
        Calendar date4 = Calendar.getInstance();

         
        date1.set(2022, 5, 1);
        date2.set(2023, 9, 7);
        date3.set(2022, 12, 10);

        othman.addPayment(date1.getTime(), 200, "online transaction");
        othman.addPayment(date2.getTime(), 700, "cash");
        othman.addPayment(date3.getTime(), 2000, "cash");
        othman.addPayment(date4.getTime(), 4000, "online transaction");


        System.out.println("Employee: " + othman.getName());
        
        othman.paymentHistory();

        System.out.println("Total salary: " + othman.salaryCalculation(500, 700, 50));

    }
}
