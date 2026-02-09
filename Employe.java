import java.util.Scanner;
class Employe
{
  String name,gender;
  int age;
  Scanner sc;
  Employe()
  {
    sc=new Scanner(System.in);
    System.out.println("Enter name,gender and age of the emp");
    name=sc.nextLine();
    gender=sc.next();
    age=sc.nextInt();
  }
  Employe(String name,String g,int age)
  {
   this.name=name;
   gender=g;
   this.age=age; 
  }

  void display()
 { 
    System.out.println("name : "+name);
    System.out.println("gender : "+gender);
    System.out.println("age : "+age);
 }
 public static void main(String args[])
 {
   //Employe e=new Employe();
   //e.display();
   Employe e1=new Employe("kalyan","male",33);
   e1.display();
  }
}

