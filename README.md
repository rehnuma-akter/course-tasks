Task 1 Marks 30
Create a package of your name.
Inside the package creates three classes. The name of the classes will be Main, Info, Hobby.
Info class will have two variables titled name(String) and id(integer).
Place only one variable inside the Hobby class. The name of the variable will be hobbyName(String).
Inside the main method of the Main class creates a variable section(String). Take the input of the section variable from the user.
Create the object of both the Info & Hobby class.
Print the section, name, id, and hobbyName of the user.
Apply camel coding.
Must follow the rules of naming convention.
Inside every class write your name, id, section, email, and date using multiline comments.
Submission Process

Import whole project into google drive. The name of the folder will be Task 1. Then share the link with me through the classroom assignment section.
Use the google drive of your official student mail.
Late submission means no marking. Be careful.
Task 2 Marks 30
Create a package of your name.
Inside the package creates two classes. The name of the classes will be Main, Student.
Student class will have two instance variables titled name(String) and id(integer) and one class variable universityName(String).
The student class will have a default constructor and two parameterize constructors to implement the constructor overloading.
Apply this keyword to avoid variable hiding.
Create a method display(void) to print the university name.
Create three objects of the Student class. Each object will be initialized using a different constructor.
Apply camel coding.
Must follow the rules of naming convention.
Inside every class write your name, id, section, email, and date using multiline comments.
Submission Process

Import whole project into google drive. The name of the folder will be Task 2. Then share the link with me through the classroom assignment section.
Use the google drive of your official student mail.
Late submission means no marking. Be careful.
Task 3 Marks 30
Create a package of your name.
Inside the package create five classes. The name of the classes will be Main, Sports, Cricket, Football, Player.
Sports is a parent class here. It will have a default constructor printing “Sports class called”.
Cricket class will inherit Sports class. It will have two instance variables: matchType(String), over(int), and reference type of Player class. Create a parameterized constructor to initialize them.
The Player class will have two instances variables: playerName(String), jerseyNumber(int). Create a parameterized constructor to initialize them too.
Create a method display(void) to print the match type, over of the match, name of a player, and jersey number of a player.
Football class will inherit Sports class as well. Construct a default constructor and print "Football class called". Also, call the superclass constructor explicitly.
Main class will act as a driver class. Create an object of Cricket class and pass the values: International match, 20, Shakib, 75 in the constructor. Create an object of Football class as well.
Apply camel coding.
Must follow the rules of naming convention.
Inside every class write your name, id, section, email, and date using multiline comments.
Topics here: Inheritance, Aggregation, Super Keyword

Submission Process

Import whole project into google drive. The name of the folder will be Task 3. Then share the link with me through the classroom assignment section.
Use the google drive of your official student mail.
Late submission means no marking. Be careful.
UML Class Diagram
2012020072 Create a class Gadget that has two instance variable name (String-public), price (int-public), and a constructor to initialize them. Write a method aboutGadget() that prints a welcome message. Create another class Laptop that inherits from Gadget. Write a constructor Laptop() that sets the price as 50,000 by calling a superclass constructor. Create another class of your name, i.e AAC. It will extend the Laptop class. AAC() will set the name of the laptop as MSi. Override aboutGadget() method to provide a full description of the gadget. Topics here: Inheritance Submission Process

Write your ID below the diagram
Extract pdf of the diagram from draw.io
Attach the pdf file on the classroom
Pdf name will be your ID
Late submission means no marking. Be careful.
Task 4 Marks 30
You are given an interface AdvancedArithmetic which contains two methods: int divisorSum(int n) and int findFactorial(int n). You need to write a class called MyCalculator which implements the interface.

● divisorSum method just takes an integer as input and returns the sum of all its divisors.
For example divisors of 6 are 1, 2, 3, and 6, so divisorSum should return 12. The value of
n will be at most 100.
● findFactorial method takes an integer as input and returns its factorial value. Use
bigInteger library to perform this. (n<=50)
