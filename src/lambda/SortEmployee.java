package lambda;

// sort the employee name in ascending order

import java.util.Arrays;
import java.util.List;

class Employee{
    private String name ;

    public Employee(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : "+name;
    }


}

public class SortEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Aameen"),
                new Employee("Rehan"),
                new Employee("Kaif"),
                new Employee("Faisal"));

employees.sort((e1,e2)->e1.getName().compareTo(e2.getName()));

        System.out.println(employees);

    }
}
