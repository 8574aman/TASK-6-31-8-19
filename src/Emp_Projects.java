import java.util.HashMap;


public class Emp_Projects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee,project> hm = new HashMap<Employee,project>();
		Employee e1 = new Employee(1,"Ross",540000,"SDE");
		Employee e2 = new Employee(2,"joey",740000,"MGR");
		Employee e3 = new Employee(3,"Chandler",340000,"DP");
		Employee e4 = new Employee(1,"Ross",540000,"SDE");
		
		project p1 = new project(11,"airways",897,"andrew");
		project p2 = new project(21,"Hotel",577,"monica");
		project p3 = new project(11,"Ford",327,"rachel");
		project p4 = new project(11,"Xbox",467,"pheobe");
		
		hm.put(e1,p1);
		hm.put(e2,p2);
		hm.put(e3,p3);
		hm.put(e4,p4);//similar key value as e1 to check for duplicate entries
		
		System.out.println(hm);
		
		
		
	}

}
