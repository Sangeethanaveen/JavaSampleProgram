package javafundamental.OOPS;

import java.util.Scanner;

/*
Colleges has different department: engineering , arts and Departments
consist of Engineering Department will have Library Lab
Arts Library Music room
Library will have -
BooksISBNisBookRentedAuthor
Furnituretype(chair/Tables/racks)
material(iron/wood)
StaffAgefNameLName
Model above setup using OOPS concept we have discussed todayFew Question that we need to query College class would be
How many books are available in College(arts + Engineering)
How many books are rented
How many chairs are thereTotal staff countEldest member working in library
 */
public class College {
    public void College(String dept){
        System.out.println("The college department is"+dept);
    }
}
class Engineering extends Library{

}
class Library{
    public int sno;
    public int quantity;
    public int rented;
    Scanner input = new Scanner(System.in);
    public void book(){
        System.out.println("Enter serial no:");
        this.sno = input.nextInt();
        System.out.println("Enter quantity of book");
        this.quantity=input.nextInt();

    }


}
