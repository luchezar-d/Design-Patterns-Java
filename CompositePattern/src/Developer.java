
public class Developer implements Employee {

	private String name;
	private double salary;
	
	public Developer(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public void print() {
		System.out.println("--------------------");
		System.out.println("       >  "+ this.getName());
		System.out.println("       >  "+ this.getSalary());
		System.out.println("--------------------");
	}

}
