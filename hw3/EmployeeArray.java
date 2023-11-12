import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;



public class EmployeeArray implements Iterable<Employee> {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }

    public void sortBySalary() {
        Collections.sort(employees);
    }

    public void sortByFirstNameAndSecondName() {
        Collections.sort(employees, new EmployeeComparator());
    }
}
