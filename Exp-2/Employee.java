import java.util.*;
public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ID[] = {2101020758,2101020749,2101020735,2101020761,1001400596};
        System.out.println("The available employee IDs are: ");
        for(int i=0; i<ID.length; i++){
            System.out.println(ID[i] + " ");
        }
        System.out.println(" ");

        System.out.println("For details enter the last three digit of employee ID from the above list: ");
        int num = sc.nextInt();
        switch(num){

            case 758: 
            System.out.println("Name of the employee: Shankar Singh Mahanty");
            System.out.println("Age: 20");
            System.out.println("Employee ID: 2101020758");
            System.out.println("Salary: 40-50 LPA");
            System.out.println("Address: Sahid Nagar,Bhubaneswar, Odisha");
            System.out.println("Year of joing: 2021");
            break;

            case 749:
            System.out.println("Name of the employee: Kishore Mohanty");
            System.out.println("Age: 30");
            System.out.println("Employee ID: 2101020749");
            System.out.println("Salary: 15-18LPA");
            System.out.println("Address: Bani Bihar,Bhubaneswar, Odisha");
            System.out.println("Year of joing: 2019");
            break;
            
            case 735:
            System.out.println("Name of the employee: Pankaj Singh");
            System.out.println("Age: 25");
            System.out.println("Employee ID: 2101020735");
            System.out.println("Salary: 9-12 LPA");
            System.out.println("Address: Chandigarh,Punjab");
            System.out.println("Year of joing: 2022");
            break;

            case 761:
            System.out.println("Name of the employee: Alex David");
            System.out.println("Age: 35");
            System.out.println("Employee ID: 1001400761");
            System.out.println("Salary: 20-25 LPA");
            System.out.println("Address: New Virginia, USA");
            System.out.println("Year of joing: 2020");
            break;

            case 596:
            System.out.println("Name of the employee: Swayam Prasad Sahoo");
            System.out.println("Age: 28");
            System.out.println("Employee ID: 2101020596");
            System.out.println("Salary: 30-40 LPA");
            System.out.println("Address: Kendrapara, Odisha");
            System.out.println("Year of joing: 2023");
            break;

            default:
            System.out.println("Sorry, employee of such ID is not found.");
            break;            
        }
        sc.close();
    }
}

