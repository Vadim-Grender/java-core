import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int nameComparison = e1.getFirstName().compareTo(e2.getFirstName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return e1.getSecondName().compareTo(e2.getSecondName());
    }
}