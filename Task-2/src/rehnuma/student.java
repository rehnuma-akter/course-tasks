package rehnuma;

public class student {
        String name;
        int id;
        static String universityName= "LU";
        student()
        {
            System.out.println("Default constructor");
        }
        student (String name)
        {
            this.name = name;
            System.out.println("Name is : " + name);
        }
        student (int id)
        {
            this.id = id;
            System.out.println("Id is : " + id);
        }
        void display()
        {
            System.out.println("University name is : "+ universityName);
        }
    }

/*
Name : Rehnuma Akter Ruhi
ID : 2012020052
Sec :  B
Email: cse_2012020052@lus.ac.bd
*/