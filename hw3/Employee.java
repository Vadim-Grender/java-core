
abstract class Employee implements Comparable<Employee>  {
    private String firstName, secondName ;
    private int age;
    private boolean fixedSalary;
    private double monthSalary;

    public Employee(String firstName, String secondName, int age, boolean fixedSalary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.fixedSalary = fixedSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(boolean fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public boolean isFixedSalary() {
        return fixedSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public double setMonthSalary(double monthSalary) {
        return this.monthSalary = monthSalary;
    }

    abstract public double monthSalary();


    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.getMonthSalary(), other.getMonthSalary());
    }

}
