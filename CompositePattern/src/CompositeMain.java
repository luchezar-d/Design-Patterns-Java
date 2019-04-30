
public class CompositeMain {

	public static void main(String[] args) {
		Developer dev1 = new Developer("Stoqn", 1500);
		Developer dev2 = new Developer("Petar", 2000);
		
		Manager man1 = new Manager("Georgi", 2500);
		
		man1.add(dev1);
		man1.add(dev2);
		
		Manager man2 = new Manager("Stamat", 5000);
		
		Developer dev3 = new Developer("Ivan", 4000);
		
		man2.add(man1);
		man2.add(dev3);
		
		Manager man3 = new Manager("Bash Manager", 7000);
		
		man3.add(man2);
		
		man3.print();
	}

}
