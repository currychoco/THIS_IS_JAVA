package emp;

public class Company {
	public static void main(String[] args) {
		
		Employee[] employee = {
				new Secretary("Duke", 1, "secretary", 800),
				new Sales("Tuxi", 2, "sales", 1200)
		};
		
		printEmployee(employee, false);
		
		for(Employee emp : employee) {
			((Bonus)emp).incentive(100);
		}
		
		System.out.println(" [인센티브 100 지급]");
		printEmployee(employee, true);
		
		
	}
	public static void printEmployee(Employee[] emp, boolean isTax) {
		if(!isTax) {
			System.out.println("name       department      salary    extra pay");
			System.out.println("-----------------------------------------------");
			for(Employee e : emp) {
				System.out.printf("%-10s %-15s %-10d", e.getName(), e.getDepartment(), e.getSalary());
				if(e instanceof Sales) {
					System.out.println(((Sales)e).getExtraPay());
				}
				System.out.println();
			}
		}else {
			System.out.println("name       department      salary     tax       extra pay");
			System.out.println("----------------------------------------------------------");
			for(Employee e : emp) {
				System.out.printf("%-10s %-15s %-10d %-10.1f", e.getName(), e.getDepartment(), e.getSalary(), e.tax());
				if(e instanceof Sales) {
					System.out.println(((Sales)e).getExtraPay());
				}
				System.out.println();
			}
		}
	}
}
