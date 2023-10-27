package hibernate_one_to_one.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*CREATE TABLE details (
		  id SERIAL NOT NULL,
		  city varchar(15),
		  phone_number varchar(25),
		  email varchar(30), PRIMARY KEY (id)
		);

		CREATE TABLE employees (
		  id SERIAL NOT NULL,
		  name varchar(15),
		  surname varchar(25),
		  department varchar(20), salary int, details_id int,
		  PRIMARY KEY (id),
		  FOREIGN KEY (details_id) REFERENCES details(id)
		);*/

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
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "salary")
	private int salary;
	
	//Один к одному(Uni-derictional)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "details_id")
	private Detail empDetail;
	
	
	
	public Employee() {
	}
	
	
	public Employee(String name, String surname, String department, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Detail getEmpDetail() {
		return empDetail;
	}


	public void setEmpDetail(Detail empDetail) {
		this.empDetail = empDetail;
	}

	

	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", department=" + department
				+ ", salary=" + salary + "]";
	}
}
	