package hibernate_one_to_many_uni.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import hibernate_one_to_one.Entity.Detail;

/*
 CREATE TABLE public.departments (
  id serial primary key,
  name varchar(15),
  max_salary int,
  min_salary int)
;


CREATE TABLE public.employees (
  id serial primary key,
  name varchar(15),
  surname varchar(25),
  salary int,
  department_id int,
  FOREIGN KEY (department_id) REFERENCES public.departments(id));*/

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "salary")
	private int salary;

	
	public Employee() {
	}

	public Employee(String name, String surname, int salary) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
	
	
	

}
	