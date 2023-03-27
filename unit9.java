/* Asignment 9
Create an Employee class, which holds following information:
Employee First Name
Employee Last Name
Employee Phone Number
Employee Address
Employee id
Employee Title
Employee salary
Create an application that uses the Employee class
Constructors –Getters and setters
A minimum of 3 constructors including default constructor
equals() method
Helper methods
toString() method
Create an array of 5 Employee objects
Use a Scanner to read in 5 employee information
Change 2 employees information (3-items each)
Create an Employee report at the end using appropriate class methods, to generate the report
_______________________________________________________________________________

This program gives a report on 5 different employees that the user enters.
The information is then taken, changed, and printed out back to the user as a report.
An employee class is created with 3 different constructor classes, and setter and getter methods
to meet the requirements of the assignment.
*/
import java.util.Scanner;

public class unit9 {
    public static void main(String[] args) {
        //initialize a scanner object for input
        Scanner input = new Scanner(System.in);

        //Initialize an array for the employee objects
        Employee[] employees = new Employee[5];

        System.out.println("Please enter 5 different employees, along with their information, to get a complete report.");
        
        //declare all need variables
        String firstName;
        String lastName;
        String phoneNumber;
        String eAddress;
        String eId;
        String eTitle;
        double eSalary;

        //For loop takes all the information from the user and creates an object that is stored in the array
        for(int i = 0; i<employees.length; i++) {
            System.out.println("Enter the Employee's First Name: ");
            firstName = input.nextLine();
            System.out.println("Enter Last Name: ");
            lastName = input.nextLine();
            System.out.println("Enter Phone Number: ");
            phoneNumber = input.nextLine();
            System.out.println("Enter Address: ");
            eAddress = input.nextLine();
            System.out.println("Enter ID: ");
            eId = input.nextLine();
            System.out.println("Enter Title: ");
            eTitle = input.nextLine();
            System.out.println("Enter Salary: ");
            eSalary = input.nextDouble();
            input.nextLine();

            employees[i] = new Employee(firstName, lastName, phoneNumber, eAddress, eId, eTitle, eSalary);
            System.out.println("Employee Added\n");
        }

        //Change employ information for the first employee
        employees[0].setTitle("Manager");
        employees[0].setId("898432");
        employees[0].setSalary(100000);
        //Change employ information for the second employee
        employees[1].setTitle("Engineer");
        employees[1].setId("347383");
        employees[1].setSalary(80000);

        //Header for the employee report
        System.out.println("First Name  Last Name  Phone Number  Address  ID  Title  Salary");
        System.out.println("---------------------------------------------------------------");

        //for loop calls the toString method to print out all of the information for every employee from the employees array
        for(int i = 0; i<employees.length; i++) {
        System.out.println(employees[i].toString());
        }
        
    }
}

//Employee class. This class is used to create an employee object and access getter and setter methods
class Employee {
    //Declaring variables
    String firstName;
    String lastName;
    String phoneNumber;
    String eAddress;
    String eId;
    String eTitle;
    double eSalary;

    //Constructor that takes first and last name
    Employee(String fname, String lname) {
            firstName = fname;
            lastName = lname;
    }

    //Constructor takes everything but the address and phone number
    Employee(String fname, String lname, String id, String title, double salary) {
            firstName = fname;
            lastName = lname;
            eId = id;
            eTitle = title;
            eSalary = salary;

    }

    //constructor takes the first and last name, as well as number, address, id, title, and salary
    Employee(String fname, String lname, String num, String address,
        String id, String title, double salary) {
            firstName = fname;
            lastName = lname;
            phoneNumber = num;
            eAddress = address;
            eId = id;
            eTitle = title;
            eSalary = salary;

    }

    //getter method returns all information of the employee object
    public String toString() {
        return firstName + " " + lastName + " " + phoneNumber + " " + eAddress + " " + eId + " " + eTitle + " " + eSalary;
    }

    //setter method to change the salary
    void setSalary(double amount) {
        eSalary = amount;
    }


    //setter method to change the title
    void setTitle(String title) {
        eTitle = title;
    }

    //setter method to change the id
    void setId(String id) {
        eId = id;
    }

}