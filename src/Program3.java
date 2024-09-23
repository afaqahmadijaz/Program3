//********************************************************************
//
//  Author:       Afaq Ahmad
//
//  Program #:    3
//
//  File Name:    Program3.java
//
//  Course:       ITSE 2321 Object-Oriented Programming
//
//  Due Date:     September 22nd
//
//  Instructor:   Prof. Fred Kumi
//
//  Chapter:      Chapter 3: Introduction to Classes
//
//  Description:  This program demonstrates the use of the Employee class
////              by creating two Employee objects, displaying their yearly
////              salaries, applying a 20% raise, and displaying the updated
////              yearly salaries.
//
//********************************************************************

public class Program3
{
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        // Display developer information
        developerInfo();

        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 2875.00); // Monthly salary of $2875.00
        Employee employee2 = new Employee("Jane", "Doe", 3150.75); // Monthly salary of $3150.75

        // Display each object's yearly salary
        System.out.printf("%s %s's yearly salary: $%.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());

        System.out.printf("%s %s's yearly salary: $%.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        // Give each Employee a 20% raise
        employee1.raiseSalary(20);
        employee2.raiseSalary(20);

        // Display each Employee's yearly salary again
        System.out.println("\nAfter 20% raise:");

        System.out.printf("%s %s's yearly salary: $%.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary()); // Should be $34500.00

        System.out.printf("%s %s's yearly salary: $%.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary()); // Should be $37809.00

    } // End of the main method

    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void developerInfo()
    {
        System.out.println("Name:     Afaq Ahmad");
        System.out.println("Course:   ITSE 2321 Object-Oriented Programming");
        System.out.println("Program:  Three");
        System.out.println("Due Date: September 22nd\n");
    } // End of the developerInfo method
}