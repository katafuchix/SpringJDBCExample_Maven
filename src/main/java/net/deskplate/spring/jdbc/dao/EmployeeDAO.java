package net.deskplate.spring.jdbc.dao;

import java.util.List;
import net.deskplate.spring.jdbc.model.Employee;

//CRUD operations
public interface EmployeeDAO {

	//Create
	public void save(Employee employee);
	//Read
	public Employee getById(int id);
	//Update
	public void update(Employee employee);
	//Delete
	public void deleteById(int id);
	//Get All
	public List<Employee> getAll();
}
