package D2_Activity2;

/**
 *
 * @author Renei
 */
public class EmployeeMain {
    public static void main(String[] args) {
        //Control SPace
        Employee emp1 = new Employee("John", "M", "Smith", "Clerk", "Management", 
                new Address("123 Acme", "", "Mandaluyong", "Manila", "5001"));
        emp1.printDetails();
        
        System.out.println("\n");
        
        Employee emp2 = new Employee("Jessy", "M", "Smith", "Assistant Manager", "Management", 
                new Address("123 Acme", "", "Mandaluyong", "Manila", "5001"));
        emp2.printDetails();
    }

}
