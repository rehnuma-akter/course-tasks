package rehnuma;

    import java.util.Scanner;

         public class Main {
                 public Main() {
                 }

                 public static void main(String[] args) {
                     Scanner inp = new Scanner(System.in);
                     String section = inp.nextLine();

                     Info detail = new Info ();
                     hobby hby = new hobby();
                     System.out.println("Section:" + section);
                     System.out.println("Name:" + detail.name);
                     System.out.println("Id: "+detail.id);
                     System.out.println("Hobby:"+hby.hobbyName);
                 }
             }
/*
Name : Rehnuma Akter Ruhi
ID : 2012020052
Sec :  B
Email: cse_2012020052@lus.ac.bd
Date : 17-07-2021
*/

