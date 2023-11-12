public class Freelancer extends Employee {
    private double hourPay;

    public Freelancer(String firstName,String secondName, int age, boolean fixedSalary, double hourPay) {
        super(firstName, secondName , age, fixedSalary);
        this.hourPay = hourPay;
    }

    @Override
    public double getMonthSalary() {
        return monthSalary();
    }

    @Override
    public double monthSalary() {
        return setMonthSalary(20.8 * 8 * getHourPay());
    }

    public double getHourPay() {
        return hourPay;
    }

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }
}
