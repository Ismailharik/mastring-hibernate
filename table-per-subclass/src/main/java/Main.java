import model.Contract_Employee;
import model.Employee;
import model.Regular_Employee;
import services.Services;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Employee e1=new Employee();    
	    e1.setName("Gaurav Chawla");    
	        
	    Regular_Employee e2=new Regular_Employee();    
	    e2.setName("Vivek Kumar");    
	    e2.setSalary(50000);    
	    e2.setBonus(5);    
	        
	    Contract_Employee e3=new Contract_Employee();    
	    e3.setName("Arjun Kumar");    
	    e3.setPay_per_hour(1000);    
	    e3.setContract_duration("15 hours");    
	    
	    Services services = new Services();
	    services.addEmployee(e1);
	    services.addEmployee(e2);
	    services.addEmployee(e3);
	    
	}

}
