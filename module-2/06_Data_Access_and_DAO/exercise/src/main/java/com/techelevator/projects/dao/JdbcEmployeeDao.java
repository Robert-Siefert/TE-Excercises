package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			Employee employee = new Employee();
			employee.setId(results.getInt("employee_id"));
			employee.setDepartmentId(results.getInt("department_id"));
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setBirthDate(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employees.add(employee);
		}
		return employees;

	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee " +
				"where first_name ilike  ? and last_name ilike ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,"%"+firstNameSearch+"%","%"+lastNameSearch+"%");
		while (results.next()) {
			Employee employee = new Employee();
			employee.setId(results.getInt("employee_id"));
			employee.setDepartmentId(results.getInt("department_id"));
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setBirthDate(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee join project_employee on employee.employee_id = project_employee.employee_id " +
				"WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,projectId);
		while (results.next()) {
			Employee employee = new Employee();
			employee.setId(results.getInt("employee_id"));
			employee.setDepartmentId(results.getInt("department_id"));
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setBirthDate(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {

		String sql = "Insert into project_employee(project_id,employee_id) VALUES(?,?)";

		jdbcTemplate.update(sql,projectId,employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {

		String sql = "DELETE from project_employee where project_id = ? and employee_id = ?";
		jdbcTemplate.update(sql,projectId,employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee WHERE employee_id not in(select employee_id from project_employee)";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			Employee employee = new Employee();
			employee.setId(results.getInt("employee_id"));
			employee.setDepartmentId(results.getInt("department_id"));
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setBirthDate(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employees.add(employee);
		}
		return employees;
	}


}
