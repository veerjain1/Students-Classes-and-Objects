import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    //Collect information for student's name, student id, grade, and school name using scanner and saving each piece of information in the correct data type
     Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter the name of the first student");
    String name1 = myObj.nextLine();  

    Scanner myObj1 = new Scanner(System.in); 
    System.out.println("Enter the name of the second student");
    String name2 = myObj1.nextLine();  

    Scanner myObj2 = new Scanner(System.in); 
    System.out.println("Enter the name of the third student");
    String name3 = myObj2.nextLine();  

     Scanner myObj3 = new Scanner(System.in); 
    System.out.println("Enter the student ID for first student");
    int studentID1 = myObj3.nextInt();  


    Scanner myObj4 = new Scanner(System.in); 
    System.out.println("Enter the student ID for second student");
    int studentID2 = myObj4.nextInt();  

    Scanner myObj5 = new Scanner(System.in); 
    System.out.println("Enter the student ID for third student");
    int studentID3 = myObj5.nextInt();

    Scanner myObj6 = new Scanner(System.in); 
    System.out.println("Enter the grade for first student");
    int grade1 = myObj6.nextInt();  

    Scanner myObj7 = new Scanner(System.in); 
    System.out.println("Enter the grade for second student");
    int grade2 = myObj7.nextInt();  

    Scanner myObj8 = new Scanner(System.in); 
    System.out.println("Enter the grade for third student");
    int grade3 = myObj8.nextInt();

     Scanner myObj9 = new Scanner(System.in);
    System.out.println("Enter the name of the first student's school");
    String schoolName1 = myObj9.nextLine();  

    
    Scanner myObj10 = new Scanner(System.in); 
    System.out.println("Enter the name of the second student's school");
    String schoolName2 = myObj10.nextLine();  

    Scanner myObj11 = new Scanner(System.in); 
    System.out.println("Enter the name of the third student's school");
    String schoolName3 = myObj11.nextLine();  

    //create 3 objects, 1 for each student, made by using the Student class as a blueprint
 
    Student s1 = new Student(name1,studentID1, grade1, schoolName1);
    Student s2 = new Student(name2,studentID2,grade2, schoolName2);
    Student s3 = new Student(name3,studentID3, grade3, schoolName3);

    //getting all the information for each student in one value using method in Student class

    String info1 = s1.Info(name1,studentID1, grade1,schoolName1);

    String info2 = s2.Info(name2,studentID2, grade2,schoolName2);

    String info3 = s3.Info(name3,studentID3 ,grade3,schoolName3);

    //print the information for the user to see and confirm their information

    System.out.println(info1 +"\n"+info2+"\n"+info3);

    //call the bigGrade method to find out which student is the oldest

    int bigGrade = Oldest(grade1,grade2,grade3);

    //based on the return value, we can determine which student is the oldest
    if(bigGrade ==1){
      System.out.println(name1+" is the highest grade");
    }
    if(bigGrade ==2){
      System.out.println(name2+" is the highest grade");
    }
    if(bigGrade ==3){
      System.out.println(name3+" is the highest grade");
    }

  }

  //oldest function determines which grade is larger than the others, this returns a value based on its findings

  public static int Oldest(int grade1,int grade2, int grade3){
    
    if(grade1>grade2 && grade1>grade3){
      return 1;
    }
    if(grade2>grade1 && grade2>grade3){
      return 2;
    }
    else{
      return 3;
    }
    
  }

    
  
}