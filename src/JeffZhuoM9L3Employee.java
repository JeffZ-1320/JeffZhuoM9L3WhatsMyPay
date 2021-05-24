public class JeffZhuoM9L3Employee {
    private final int OVERTIME1 = 40;
    private final int OVERTIME2 = 50;
    private int ID;
    private String job;
    private double payRate;
    private int hoursWorked;

    /**
     * The employee object needs the following arguments
     * @param ID employee ID
     * @param jobTitle employee's job title
     * @param payRate employee's pay rate
     * @param hoursWorked total hours the employee worked
     */
    public JeffZhuoM9L3Employee(int ID, String jobTitle, String payRate, int hoursWorked) {
        this.ID = ID;
        this.job = jobTitle;
        this.payRate = Double.parseDouble(payRate.replace("$", ""));
        this.hoursWorked = hoursWorked;
    }

    /**
     * The gross pay is the total amount the company will pay the employee
     * @return gross pay
     */
    public double getGrossPay(){
        return getRegularPay(this.hoursWorked) + get40To50Pay(this.hoursWorked) + getOver50Pay(this.hoursWorked);
    }

    /**
     * Under 40 hours, employees will be paid on regular pay rates.
     * @param hours total hours worked
     * @return total regular pay
     */
    public double getRegularPay(int hours){
        if(hours <= OVERTIME1){
            return hours * payRate;
        }else{
            return OVERTIME1 * payRate;
        }
    }

    /**
     * Between 40 and 50 hours, employees get paid 1.5 * their regular pay rate.
     * @param hours total hours worked
     * @return total pay for hours between 40 and 50
     */
    public double get40To50Pay(int hours){
        if(hours >= OVERTIME2){
            return 10 * 1.5 * payRate;
        }else if(hours > OVERTIME1){
            return (hours - OVERTIME1) * 1.5 * payRate;
        }else{
            return 0;
        }
    }

    /**
     * Over 50 work hours, employees get paid 2 * their pay rate.
     * @param hours total hours worked
     * @return total pay for hours abover 50 hours
     */
    public double getOver50Pay(int hours){
        if(hours <= OVERTIME2){
            return 0;
        }else{
            return (hours - OVERTIME2) * 2 * payRate;
        }
    }
    // below are getter for the instance variables
    public int getID() {
        return ID;
    }

    public String getJob() {
        return job;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}


