package company;

public class Runner {

	public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
        CompanyDirectory devDirectory = new CompanyDirectory(); 
        devDirectory.addEmployee(dev1); 
        devDirectory.addEmployee(dev2); 
          
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
          
        CompanyDirectory manDirectory = new CompanyDirectory(); 
        manDirectory.addEmployee(man1); 
        manDirectory.addEmployee(man2); 
      
        CompanyDirectory directory = new CompanyDirectory(); 
        directory.addEmployee(devDirectory); 
        directory.addEmployee(manDirectory); 
        directory.showEmployeeDetails(); 

	}

}
