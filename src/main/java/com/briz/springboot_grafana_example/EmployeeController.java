package com.briz.springboot_grafana_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepository erepo;
	
@RequestMapping("/grafana")
public String test()
{
	return "This is grafana Test";
}
@RequestMapping("/save")
public Employee savedata(@RequestBody Employee employee)
{
	erepo.save(employee);
	return employee;
}
@RequestMapping("/all")
public List<Employee> all()
{
	return erepo.findAll();
}
@RequestMapping("/byid/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	return erepo.findById(id);
}
@RequestMapping("/byname/{name}")
public Employee byname(@PathVariable String name)
{
	Employee e=erepo.findByName(name);
	return e;
}
@RequestMapping("/update/{id}")
public Employee update(@PathVariable int id,@RequestBody Employee employee)
{
	Employee e=erepo.findById(id).get();	
	e.setAge(employee.getAge());
	e.setCity(employee.getCity());
	e.setName(employee.getName());
	erepo.save(e);
	return e;
	}	
@RequestMapping("/del/{id}")
public String delete(@PathVariable int id)
{
	erepo.deleteById(id);
	return "data delete for "+id;
}
}
