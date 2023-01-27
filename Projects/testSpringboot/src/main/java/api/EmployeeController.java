package api;

import model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RequestMapping
@RestController
public class EmployeeController {
    List<Employee> employeeList = List.of(Employee.builder().id(1L).employeeName("Chris").age(20).build(),
            Employee.builder().id(2L).employeeName("Rosy").age(25).build(),
            Employee.builder().id(3L).employeeName("Jill").age(30).build()
    );

    //GET all the employees
    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeList;
    }

    //Get the employee by id
    @GetMapping("/id/{empid}")
    public Employee getEmployeeById(@PathVariable long empid){
        Optional<Employee> employee =  employeeList.stream().filter(emp ->  emp.getId() == empid).findFirst();
        return employee.orElse(null);
    }

}
