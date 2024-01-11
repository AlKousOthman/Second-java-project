import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private int employeeID;
    private String name;
    private String position;
    private double basicSalary;


    private ArrayList<Double> payments = new ArrayList<Double>();
    private ArrayList<Date> dates = new ArrayList<Date>();
    private ArrayList<String> methods = new ArrayList<String>();




    public Employee(int employeeID, String name, String position, double basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
    }
    
    
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }


    public double salaryCalculation(double overTime, double bonuses, double deductions){

        return basicSalary + overTime + bonuses - deductions;
    }

     public void paymentHistory(){
        System.out.println("Payments received");
        System.out.println("\tdate\t\t\t\tamount\tmethod");
        for(int i = 0; i < payments.size(); i++){

            System.out.println("\t" + dates.get(i) + "\t" + payments.get(i) + "\t" + methods.get(i));
        }
     }

     public void addPayment(Date date, double amount, String method){
        dates.add(date);
        payments.add(amount);
        methods.add(method);

     }
    
   
}
