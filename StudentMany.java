import java.util.Scanner;

public class StudentMany
{
   public static void main(String[] args)
   {
      String name;
      String surname;
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
      
         System.out.println("+----------------+-------------+-------------+-------+");
         System.out.printf("| %-15s|", "NAME");
         System.out.printf(" %-12s|", "SURNAME");
         System.out.printf(" %-12s|", "STUDENT ID");
         System.out.printf(" %-6s|\n", "QUIZ");
            
         System.out.println("+----------------+-------------+-------------+-------+");
         System.out.printf("| %-15s|", name);
         System.out.printf(" %-12s|", surname);
         System.out.printf(" %-12s|", student_id);
         System.out.printf(" %-6d|\n", quiz_grade);
         System.out.println("+----------------+-------------+-------------+-------+");

         System.out.print("\nDo you want to continue (y/n): ");
         in.nextLine();
         if( "n".equals( in.nextLine() ) ) {
           last_student = true;
         };
         
       }
   }
}
