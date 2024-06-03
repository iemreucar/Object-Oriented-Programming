import java.util.Scanner;

public class StudentDCW
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
     boolean last_student = false;
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

      System.out.print("+");
      // name_length + 2 for the space before/after student_name or HEADER (Ln48) 
      for (int i=0; i < name_length+2; i++) { System.out.print("-"); };   
      System.out.print("+");

      // surname_length + 2 for the space before/after student_surname or HEADER (ln51)
      for (int i=0; i < surname_length+2; i++) { System.out.print("-"); };   
      System.out.print("+");
      
      // student_id has a fixed length of 9 digits, 
      // "STUDENT ID" HEADER determines cell width 
      System.out.print("------------+"); 
      
      // quiz_grade can be at most 3 digits, 
      // "QUIZ" HEADER determines cell width 
      System.out.println("------+"); 

      System.out.print("| NAME");
      // Fill in with extra ' ' characters if name_length >= NAME_LENGTH
      for (int i=0; i < name_length-NAME_LENGTH + 1; i++) {
         System.out.print(" ");   
      };
      
      System.out.print("| SURNAME");
      // Fill in with extra ' ' characters if surname_length >= SURNAME_LENGTH
      for (int i=0; i < surname_length-SURNAME_LENGTH + 1; i++) {
         System.out.print(" ");
      };

      // STUDENT ID HEADER string have fixed length
      System.out.print("| STUDENT ID ");
       
      // QUIZ HEADER string have fixed length
      System.out.print("| QUIZ ");
      
      System.out.println("|");
         
      System.out.print("+");
      // name_length + 2 for the space before/after student_name or HEADER (Ln48) 
      for (int i=0; i < name_length+2; i++) { System.out.print("-"); };   
      System.out.print("+");

      // surname_length + 2 for the space before/after student_surname or HEADER (ln51)
      for (int i=0; i < surname_length+2; i++) { System.out.print("-"); };   
      System.out.print("+");
      
      // student_id has a fixed length of 9 digits, 
      // "STUDENT ID" HEADER determines cell width 
      System.out.print("------------+"); 
      
      // quiz_grade can be at most 3 digits, 
      // "QUIZ" HEADER determines cell width 
      System.out.println("------+"); 
      
      System.out.print("| " + name);
      // Fill in with extra ' ' characters if name_length >= name.length() 
      for (int i=0; i < name_length-name.length() + 1; i++){
         System.out.print(" ");
      };

      System.out.print("| " + surname);
      // Fill in with extra ' ' characters if surname_length >= surname.length() 
      for (int i=0; i < surname_length-surname.length() + 1; i++) {
         System.out.print(" ");
      };
      
      // student_id has a fixed length of 9 digits, 
      // "STUDENT ID" HEADER determines cell width 
      System.out.printf( "| %-11s",  student_id ); 

      // quiz_grade can be at most 3 digits, 
      // "QUIZ" HEADER determines cell width 
      System.out.printf( "| %-5d",  quiz_grade ); 
      System.out.println("|");
             
      System.out.print("+");
      // name_length + 2 for the space before/after student_name or HEADER (Ln48) 
      for (int i=0; i < name_length+2; i++) { System.out.print("-"); };   
      System.out.print("+");

      // surname_length + 2 for the space before/after student_surname or HEADER (ln51)
      for (int i=0; i < surname_length+2; i++) { System.out.print("-"); };   
      System.out.print("+");
      
      // student_id has a fixed length of 9 digits, 
      // "STUDENT ID" HEADER determines cell width 
      System.out.print("------------+"); 
      
      // quiz_grade can be at most 3 digits, 
      // "QUIZ" HEADER determines cell width 
      System.out.println("------+"); 

      System.out.print("\nDo you want to continue (y/n): ");
      in.nextLine();
      if( "n".equals( in.nextLine() ) ) {
        last_student = true;
      };      
    };
  };
};
