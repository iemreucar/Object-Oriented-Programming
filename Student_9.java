public class Student {
  private String name;
  private String surname;
  private String studentID;
  private int quizGrade;
   
  public void setName(String studentName) {
    name = studentName;
  }
  
  public void setSurname(String studentSurname) {
    surname = studentSurname;
  }

   public void setStudentID(String ID) {
     studentID = ID;
   }
   
   public void setQuizGrade(int grade) {
     quizGrade = grade;
   }
   
   public String getName() {
      return name;
   }
   
   public String getSurname() {
     return surname;
   }
   
   public String getStudentID() {
     return studentID;
   }
   
   public int getQuizGrade() {
     return quizGrade;
   }
}