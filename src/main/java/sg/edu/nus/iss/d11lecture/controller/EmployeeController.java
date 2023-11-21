package sg.edu.nus.iss.d11lecture.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.d11lecture.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    //@RequestMapping(path = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ashlyn", "Chew","ashlynchewvisa.com.sg"));
        employees.add(new Employee("Alicia","Ong","aliciaongvisa.com.sg"));
        employees.add(new Employee("Darien","Lim","darienlimvisa.com.sg"));

        return employees;

    }
    
}
