public class Worker extends Employee{
    public Worker(String firstName,String secondName, int age, boolean fixedSalary) {
        super(firstName, secondName, age, fixedSalary);
    }

    @Override
    public double monthSalary() {
        return getMonthSalary();
    }
}
