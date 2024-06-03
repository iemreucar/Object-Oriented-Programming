import java.util.Scanner;

public class StudentMethods

{
   public static void main(String[] args)
   {
     String name;
     int name_length;
     final int NAME_LENGTH = "NAME".length();
     String surname;
     int surname_length;
     final int SURNAME_LENGTH = "SURNAME".length();

     String student_id;
     int quiz_grade;
     boolean last_student = true;
     Scanner in = new Scanner( System.in );
           
     while (!last_student) {
        System.out.print("Name: ");
        name = in.nextLine();
     
        System.out.print("Surname: ");
        surname = in.next();
     
        System.out.print("Student ID: ");
        student_id = in.next();
        while(student_id.length() != 9){
          System.out.println("Student ID must be 9 digits!, " +
                             "please try again with a valid Student ID!");
       
          System.out.print("Student ID: ");
          student_id = in.next();
        };    

        System.out.print("Quiz Grade: ");
        quiz_grade = in.nextInt();  
        while(quiz_grade <0 || quiz_grade >100){
          System.out.println("The grade must be between 0 and 100, " +
                             "please try again with a valid quiz grade!");

          System.out.print("Quiz Grade: ");
          quiz_grade = in.nextInt();  
        };              

        name_length = name.length();
        if (name_length < NAME_LENGTH) { name_length = NAME_LENGTH; }; 
  
        surname_length = surname.length();
        if (surname_length < SURNAME_LENGTH) { surname_length = SURNAME_LENGTH; }; 

        // YOU HAVE TO IMPLEMENT BODIES OF THE METHODS
        // printRowSeparator() and printCell() GIVEN BELOW  
        // THE OUTPUT MUST BE AS IN THE PREVIOUS WEEK 
        int id_length = "STUDENT ID".length();
        int quiz_length = "QUIZ".length();
        
        
        printRowSeparator( name_length, surname_length, id_length, quiz_length );
        printCell( "NAME", name_length, "SURNAME", surname_length,"STUDENT ID", id_length,"QUIZ", quiz_length);
        printRowSeparator( name_length, surname_length, id_length, quiz_length );
        printCell( name, name_length, surname, surname_length, student_id, id_length, String.valueOf(quiz_grade), quiz_length);
        printRowSeparator( name_length, surname_length, id_length, quiz_length );
        
        
        System.out.print("\nDo you want to continue (y/n): ");
        
        in.nextLine();
        
        if( "n".equals( in.nextLine() ) ) {
          last_student = true;
        };      
      };
  };
  // End of main() method


   // Print out a line in the form: | studentID | studentName | studentSurname |
   // The '|' characters separating the cells must be aligned with 
   //     '+' characters in row separator 
   public static void printCell( String a,    int nameWidth, 
		   						 String b, int surnameWidth,
                                 String idContent,      int idWidth,
                                 String quizContent,    int quizWidth)
   {
     System.out.print("| " + nameContent);
     for (int i=0; i < nameWidth - nameContent.length() + 1; i++) {
        System.out.print(" ");   
     };

     System.out.print("| " + surnameContent);
     for (int i=0; i < surnameWidth - surnameContent.length() + 1; i++) {
        System.out.print(" ");   
     };

     System.out.print("| " + idContent);
     for (int i=0; i < idWidth - idContent.length() + 1; i++) {
        System.out.print(" ");   
     };

     System.out.print("| " + quizContent);
     for (int i=0; i < quizWidth - quizContent.length() + 1; i++) {
        System.out.print(" ");   
     };

     System.out.println("|");
   } // End of printCell() method
   
   // Print out a line in the form: +-------+--------+-------+
   // The '+' characters in row separator must be aligned with 
   //     '|' characters separating the cells  
   public static void printRowSeparator( int nameWidth, int surnameWidth, 
                                         int idWidth,   int quizWidth )
   {
     System.out.print("+");
     for (int i=0; i < nameWidth+2; i++) { System.out.print("-"); };   

     System.out.print("+");
     for (int i=0; i < surnameWidth+2; i++) { System.out.print("-"); };   

     System.out.print("+");
     for (int i=0; i < idWidth+2; i++) { System.out.print("-"); };   

     System.out.print("+");
     for (int i=0; i < quizWidth+2; i++) { System.out.print("-"); };   

     System.out.println("+");
     
   } // End of printRowSeparator() method
}

