// WAP to use “this” keyword to refer to current class parameterized constructor.

public class EmployeeDetails {
    String name; int eid; int salary;
    EmployeeDetails(String name, int eid, int salary)
    {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails("Shankar",758,190);
        EmployeeDetails e2 = new EmployeeDetails("Adarsh",107,50);

        System.out.println("Employee 1 :");
        System.out.println(e1.name);
        System.out.println(e1.eid);
        System.out.println(e1.salary);

        System.out.println("Employee 2 :");
        System.out.println(e2.name);
        System.out.println(e2.eid);
        System.out.println(e2.salary);

    }
}