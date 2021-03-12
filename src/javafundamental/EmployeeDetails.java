package javafundamental;

import java.sql.SQLOutput;

/*
Create Employee - > Part time employee , Full time employee
Employee
 1. Id
 2. role
 3 salary
Part time employee :
number of hours()
shift
Full time employee :
facilities()...
etc...
 */
public class EmployeeDetails {
    String company;
    String position;

    public void details(String company,String position) {
        System.out.println("the company name is" + company);
    }
    public void Employeedetail(String name,String Position) {
        System.out.println("Employee works in " +company);
        System.out.println("The position is "+position);
}

class FullTimeEmployee extends EmployeeDetails {
    String name;
    int id;
    String role;
    String Position;

    public void Fulltimedetail(int id,String name)
    {
        System.out.println("the id and name are "+id +name);
    }
    public void Workdetail(String role,String position){
        System.out.println("The role and position are"+role +position);

    }


    }
  class PartTimeEmployee extends EmployeeDetails{

        void PartTime(int hour, int days){
            int totalHour = hour * days;
            System.out.println("the employee has worked for "+totalHour);

        }

    }

    public static void main(String[] args) {
        EmployeeDetails per1 = new EmployeeDetails();
       // FullTimeEmployee per2 = new FullTimeEmployee();



    }
}
