//********************************************************************
//
//  Author:       Afaq Ahmad
//
//  Program #:    3
//
//  File Name:    Employee.java
//
//  Course:       ITSE 2321 Object-Oriented Programming
//
//  Due Date:     September 22nd
//
//  Instructor:   Prof. Fred Kumi
//
//  Chapter:      Chapter 3: Introduction to Classes
//
//  Description:  The Employee class includes private instance variables
//                for first name, last name, and monthly salary. It provides
//                getter and setter methods for each, and methods to calculate
//                yearly salary and apply a raise.
//
//********************************************************************

public class Employee
{
    // Private instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    //***************************************************************
    //
    //  Constructor:  Employee
    //
    //  Description:  Initializes the instance variables
    //
    //  Parameters:   String fName, String lName, double salary
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Employee(String fName, String lName, double salary)
    {
        firstName = fName;
        lastName = lName;
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    // Getter and Setter for firstName
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    // Getter and Setter for lastName
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    public String getLastName()
    {
        return lastName;
    }

    // Getter and Setter for monthlySalary
    public void setMonthlySalary(double salary)
    {
        if (salary > 0)
            monthlySalary = salary; // Do not set if salary is not positive
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary()
    {
        return monthlySalary * 12;
    }

    // Method to apply a raise by a percentage
    public void raiseSalary(double percent)
    {
        if (percent > 0)
            monthlySalary += monthlySalary * percent / 100;
    }
}
