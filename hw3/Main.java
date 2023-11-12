public class Main {
    public static void main(String[] args) {
        EmployeeArray employeeArray = new EmployeeArray();
        Freelancer freelancer1 = new Freelancer("Иван","Иванов", 23,false,50);
        Freelancer freelancer2 = new Freelancer("Петр", "Петров", 30, false, 70);
        Freelancer freelancer3 = new Freelancer("Человек", "Человеков", 27, false, 100);
        Worker worker1 = new Worker("Работяга", "Работягов", 45, true);
        Worker worker2 = new Worker("Трудяга", "Трудягов", 42, true);
        Worker worker3 = new Worker("Бродяга", "Бродягов", 37, true);


        worker1.setMonthSalary(21000);
        worker2.setMonthSalary(20000);
        worker3.setMonthSalary(30000);


        employeeArray.addEmployee(freelancer1);
        employeeArray.addEmployee(freelancer2);
        employeeArray.addEmployee(freelancer3);
        employeeArray.addEmployee(worker1);
        employeeArray.addEmployee(worker2);
        employeeArray.addEmployee(worker3);


        for (Employee e: employeeArray){
            System.out.println(e.getFirstName() + " " + e.getSecondName() + " " + e.getAge() + " " + e.getMonthSalary());
        }

        employeeArray.sortBySalary();
        System.out.println("Sorted by Salary:");
        for (Employee p : employeeArray) {
            System.out.println(p.getMonthSalary());
        }

        employeeArray.sortByFirstNameAndSecondName();
        System.out.println("Sorted by FirstName and SecondName:");
        for (Employee p : employeeArray) {
            System.out.println(p.getFirstName() + " " + p.getSecondName());
        }
    }
}