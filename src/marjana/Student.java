/*
Name: Marjana Begum
ID: 1812020238
Section: 5(c)
Email: cse_1812020238@lus.ac.bd
Date: 08-08-2021
*/
package marjana;

public class Student {
    String name;
    int id;
    static  String universityName = "Leading University,Sylhet";
    Student()
    {

    }
    Student(String name){
        this.name = name;
        System.out.println("Name: " +name);
    }
    Student(int id)
    {
        this.id = id;
        System.out.println("ID: " +id);
    }
    void display()
    {
        System.out.println("University: " +universityName);
    }

}
