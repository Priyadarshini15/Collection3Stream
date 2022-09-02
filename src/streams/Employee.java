package streams;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Employee(String name, int age,int salary,boolean isMale) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isMale=isMale;
	}
	public String toString() {
		return"Name= "+name+", Age= "+age+", Salary= "+salary+", IsMale= "+isMale;
	}
	}


