import java.util.Comparator;

public class CompareByAge implements Comparator<Customer> {
	
	public  int compare(Customer o1 , Customer o2) {
		return o1.age-o2.age;

		
	}
	
}
