package D2_Activity2;


/**
 *
 * @author Renei
 */
public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String jobTitle;
    private String department;
    private Address address;

//  Constructors

    public Employee(String firstName, String middleName, String lastName, String jobTitle, String department, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.address = address;
    }

    
    
    // getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Department: " + department);
        System.out.println("Address: " + address);
        address.getAddressDetails();
    }
    
}
