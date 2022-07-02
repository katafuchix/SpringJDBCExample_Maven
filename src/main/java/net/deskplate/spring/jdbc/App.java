package net.deskplate.spring.jdbc;

import java.util.List;
import java.util.Random;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import net.deskplate.spring.jdbc.dao.EmployeeDAO;
import net.deskplate.spring.jdbc.model.Employee;

public class App
{
    public static void main( String[] args )
    {
      //Get the Spring Context
  		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

  		//Get the EmployeeDAO Bean
  		//EmployeeDAO employeeDAO = ctx.getBean("employeeDAO", EmployeeDAO.class);
  		//To use JdbcTemplate
  		EmployeeDAO employeeDAO = ctx.getBean("employeeDAOJDBCTemplate", EmployeeDAO.class);

  		//Run some tests for JDBC CRUD operations
  		Employee emp = new Employee();
  		int rand = new Random().nextInt(1000);
  		emp.setId(rand);
  		emp.setName("名無しプログラマー");
  		emp.setRole("Java Developer");

      // 新規登録
  		employeeDAO.save(emp);

      // データ読み出し
  		Employee emp1 = employeeDAO.getById(rand);
  		System.out.println("Employee Retrieved::"+emp1);

  		// 更新
  		emp.setRole("CEO");
  		employeeDAO.update(emp);

  		// 全件取得
  		List<Employee> empList = employeeDAO.getAll();
  		System.out.println(empList);

  		// 削除
  		employeeDAO.deleteById(rand);

  		//Close Spring Context
  		ctx.close();

  		System.out.println("DONE");

    }
}
