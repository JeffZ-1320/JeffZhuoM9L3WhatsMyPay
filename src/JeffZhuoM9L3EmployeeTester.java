/*
Program Name:JeffZhuoM9L3Employee
Author: Jeff Zhuo
Date: 1/6/2020
Program description:
    You are the payroll supervisor. Your company pays the employees every two weeks. The formula for overtime pay is the
    same regardless of what job you perform. Once you work 40 hours a week, the overtime formula calculates. This
    formula is the most common problem in your department so you have decided to write a program to calculate each
    employee’s pay.
What I learned from this program:
    How to read from a file and create objects to perform actions.
What difficulties did I have and how I solved them:
    This assignment took me a while, and the $payRate in the file took some time to figure out and get rid of.
*/

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class JeffZhuoM9L3EmployeeTester {
    public static void main(String[] args) throws FileNotFoundException {
        File employeeFile = new File("EmployeeData.txt");
        Scanner scan = new Scanner(employeeFile);
        // prints header
        System.out.println("       Employee ID      Pay Rate     Hours Worked    Gross Pay\n");
        // while there is still a next employee the condition will be true
        while(scan.hasNext()){
            // the employee data for each employee
            int employeeID = scan.nextInt();
            scan.nextLine();
            String jobTitle = scan.nextLine();
            String payRate = scan.nextLine();
            int hoursWorded = scan.nextInt();
            scan.nextLine();
            // create the employee object
            JeffZhuoM9L3Employee employee = new JeffZhuoM9L3Employee(employeeID, jobTitle, payRate, hoursWorded);
            System.out.printf("%14d          $%6.2f%12d          $%8.2f%n", employee.getID(), employee.getPayRate(), employee.getHoursWorked(), employee.getGrossPay());
        }
    }
}

/*
Sample Output:
       Employee ID      Pay Rate     Hours Worked    Gross Pay
          2343          $ 29.75          64          $ 2469.25
          3496          $321.50          64          $26684.50
          4565          $ 21.50          64          $ 1784.50
          4579          $ 21.50          64          $ 1784.50
          3454          $ 21.50          45          $ 1021.25
          3455          $ 21.50          45          $ 1021.25
          4567          $ 21.50          45          $ 1021.25
          5888          $ 21.50          40          $  860.00
          3456          $ 21.50          40          $  860.00
          1123          $ 10.33          60          $  774.75
          1658          $ 10.33          60          $  774.75
          4099          $ 10.33          40          $  413.20
          6788          $ 10.33          40          $  413.20
          4900          $  9.50          44          $  437.00
          1167          $  9.50          44          $  437.00
          2234          $  9.50          44          $  437.00
          2567          $  9.50          44          $  437.00
          3321          $  9.50          44          $  437.00
          1168          $  9.50          40          $  380.00
          6555          $  9.50          40          $  380.00

*/
