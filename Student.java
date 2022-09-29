class Student{//student class


  //create variables to save informaton to later
  private String nameOfStudent;
    private int studentID;
  private int stuGrade;
    private String hsName;

  public Student(){//default constructor to save empty variables

     nameOfStudent = "";
    studentID = 0;
    stuGrade =0;
    hsName = "";
  }
  //constructor with parameters, allowing values to be saved to the variables when the function is called from main
  public Student(String name, int stuID, int grade, String schoolName){

    nameOfStudent = name;
    studentID = stuID;
    stuGrade = grade;
    hsName = schoolName;
    
  }

  //accessor method does not edit the values but use them to make them viewable and easy to read for the user

  public String Info(String name, int stuID, int grade, String schoolName){
     String ret = "\n\n Here is the information about "+name+": \n Name: "+name+"\n Student ID: "+stuID +"\n Grade Level: "+grade+"\n School Name: "+schoolName+"\n\n";

    return ret;//return the string which contains all the information
  }

  



  
}