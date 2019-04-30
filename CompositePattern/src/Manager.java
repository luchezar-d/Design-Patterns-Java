import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private double salary;
	
	List<Employee> employees = new ArrayList<Employee>();
	
	public Manager(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		this.employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		this.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		this.employees.get(i);
		return null;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public void print() {
		System.out.println("--------------------");
		System.out.println(">  "+ this.getName());
		System.out.println(">  "+ this.getSalary());
		System.out.println("--------------------");
		
		Iterator<Employee> iter = employees.iterator();
		
		while(iter.hasNext()) {
			Employee employee = iter.next();
			employee.print();
		}
	}

}
