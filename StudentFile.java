import java.util.Scanner;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;

public class StudentFile
{
   public static void main(String[] args)
   {
     ArrayList<String> name = new ArrayList<String>();
     int name_length;
     final int NAME_LENGTH = "NAME".length();

     ArrayList<String> surname = new ArrayList<String>();
     int surname_length;
     final int SURNAME_LENGTH = "SURNAME".length();

     ArrayList<String> student_id = new ArrayList<String>();
     int id_length = "STUDENT ID".length();

     ArrayList<Integer> quiz_grade = new ArrayList<Integer>();
     int quiz_length = "QUIZ".length();
     
     Scanner in;     
     try { 
       in = new Scanner( new File(args[0]) ); 
     }
     catch (FileNotFoundException ex) { 
        System.out.println("File not found");
        return;
     }
     
     name_length = NAME_LENGTH;
     surname_length = SURNAME_LENGTH;
     while( in.hasNextLine() ) {
        name.add( in.nextLine() );
        surname.add( in.next() );
        student_id.add( in.next() );
        quiz_grade.add( in.nextInt() );  
        in.nextLine();
        
        if (name_length < name.get( name.size()-1 ).length() ) { 
          name_length = name.get( name.size()-1 ).length(); 
        }; 
  
        if (surname_length < surname.get( surname.size()-1 ).length() ) { 
          surname_length = surname.get( surname.size()-1 ).length(); 
        }; 

      };

      printRowSeparator( name_length, surname_length, id_length, quiz_length );
      printCell( "NAME", name_length, 
                 "SURNAME", surname_length,
                 "STUDENT ID", id_length,
                 "QUIZ", quiz_length);
     printRowSeparator( name_length, surname_length, id_length, quiz_length );

      for (int i=0; i< name.size(); i++){
         // Since quiz_grade is a number (e.g., 100) 
         // and the last formal parameter of printCell() method expects a String
         // we convert quiz_grade into a String (e.g., "100") 
         // by String.valueOf() method
         printCell( name.get(i), name_length, 
                    surname.get(i), surname_length,
                    student_id.get(i), id_length,
                    String.valueOf(quiz_grade.get(i)), quiz_length   
                  );

         printRowSeparator( name_length, surname_length, id_length, quiz_length );
     }; // for() table loop 
  };
  // End of main() method


   // Print out a line in the form: | studentID | studentName | studentSurname |
   // The '|' characters separating the cells must be aligned with 
   //     '+' characters in row separator 
   public static void printCell( String nameContent,    int nameWidth, 
                                 String surnameContent, int surnameWidth,
                                 String idContent,      int idWidth,
                                 String quizContent,       int quizWidth)
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

