import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeObject {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000, 30),
                new Employee("Bob", 75000, 25),
                new Employee("Alice", 60000, 28),
                new Employee("Charlie", 50000, 35),
                new Employee("Bob", 75000, 22)
        );
       for(Employee list : employees){
           System.out.println(list.getName()+"--->"+list.getAge()+"----->"+list.getSalary());
        }

    }
}
