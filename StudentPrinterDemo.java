import java.util.Scanner;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;

public class StudentPrinterDemo
{
   public static void main(String[] args)
   {
     // "Student"s as an ArrayList
     ArrayList<StudentPrinter> students = new ArrayList<StudentPrinter>();

     int name_length;
     final int NAME_LENGTH = "NAME".length();

     int surname_length;
     final int SURNAME_LENGTH = "SURNAME".length();

     int id_length = "STUDENT ID".length();
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
        // Add a new Student to the ArrayList 
        students.add( new StudentPrinter() );
       
        // Use the added Student to set information 
        StudentPrinter student = students.get( students.size()-1 );

        student.setName( in.nextLine() );
        student.setSurname( in.next() );
        student.setStudentID( in.next() );
        student.setQuizGrade( in.nextInt() );  
        in.nextLine();
        
        if (name_length < student.getName().length() ) { 
          name_length = student.getName().length(); 
        }; 
  
        if (surname_length < student.getSurname().length() ) { 
          surname_length = student.getSurname().length(); 
        }; 

      };

      StudentPrinter.printRowSeparator( name_length, surname_length, id_length, quiz_length );
      StudentPrinter.printHeadCell( "NAME", name_length, "SURNAME", surname_length,
                                  "STUDENT ID", id_length, "QUIZ", quiz_length);
      StudentPrinter.printRowSeparator( name_length, surname_length, id_length, quiz_length );

      for (int i=0; i< students.size(); i++){
         // Since quiz_grade is a number (e.g., 100) 
         // and the last formal parameter of printCell() method expects a String
         // we convert quiz_grade into a String (e.g., "100") 
         // by String.valueOf() method
         students.get(i).printStudentCell( name_length, surname_length,
                                           id_length,   quiz_length   
                                         );

         StudentPrinter.printRowSeparator( name_length, surname_length, id_length, quiz_length );
     }; // for() table loop 
  };
  // End of main() method
}

