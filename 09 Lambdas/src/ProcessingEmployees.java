
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);   //A method reference.

      // To test Collectors.joining
      // Convert elements to strings and concatenate them, separated by commas
      String joined = list.stream()
              .map(Object::toString)  //  this DOES go to the overridden method  toString  inside Employee!!  Yes!!

                                     //  joining method needs Strings coming in.  

              //.map(Employee::toString)  //  this also DOES work!!  Yes!!
              .collect(Collectors.joining(", "));

      System.out.println("\n\n" + joined);
      
      System.out.println("\n ***** 1)  Count the number of last names that begin with the letter  ‘B’.  Print out this number. *****");
      System.out.println("Answer:" + 
              list.stream()
	          //.map(Employee::getLastName)
	          .filter(e -> e.getLastName().startsWith("B"))
	          .count()
      );
      
      System.out.println("\n ***** 2)  Print out all of the Employee objects whose last name begins with the letter  ‘B’  in sorted order.   *****");
      System.out.println("Answer:");
      list.stream()
	  .filter(e -> e.getLastName().startsWith("B"))
	  .sorted(Comparator.comparing(Employee::getLastName))
	  .forEach(System.out::println);
	       
      System.out.println("\n ***** 3)  Print out all of the Employee objects whose last name begins with the letter  ‘B’  and change their first name and last name to be All capital letters.   *****");
      System.out.println("Answer:");
      list.stream()
      .filter(e -> e.getLastName().startsWith("B"))
      .map(e -> new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()))
      .forEach(System.out::println);
      
      System.out.println("\n ***** 4)  Print out All of the employee objects, but if the last name begins with the letter  ‘B’,  then capitalize all the letters in the last name. *****");
      System.out.println("Answer:");
      Stream <Employee> s1 = list.stream()
    		  				 .filter(e -> e.getLastName().startsWith("B"))
    		  				 .map(e -> new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()));
      Stream <Employee> s2 = list.stream()
				             .filter(e -> !e.getLastName().startsWith("B"));
      Stream.concat(s1, s2)
      	    .forEach(System.out::println);
				 
      
      System.out.println("\n ***** 4.1)  Use the  Collectors.joining  method to print out All Employee objects.  (See my  presentation file  ‘Do_Last_This_Was_Lesson 9_Streams_E.docx’.) *****");
      System.out.println("Answer:" + 
	      list.stream()
	      .map(Employee::toString)
	      .collect(Collectors.joining(","))
      );
      
      System.out.println("\n ***** 4.2)  Use the  Collectors.joining  method to print out All Employee objects, and separate each one with a delimeter of  “---\\n---“. *****");
      System.out.println("Answer:" + 
	      list.stream()
	      .map(Employee::toString)
	      .collect(Collectors.joining("\n"))
      );
      
      System.out.println("\n ***** 5)  Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’  in sorted order, and get rid of all the duplicates.  Print out only the last names.  *****");
      System.out.println("Answer:");
      list.stream()
          .map(e -> e.getLastName())
          .filter(e -> e.startsWith("I"))
          .distinct()
          .sorted()
          .forEach(System.out::println);
      
      System.out.println("\n ***** 6)  Print out the average of all the salaries. *****");
      System.out.println("Answer:" +
      list.stream()
          .mapToDouble(e -> e.getSalary())
          .average()
          .getAsDouble());
          
      System.out.println("\n ***** 7)  Use the  ‘reduce’  method to print out the total salary of all employees. *****");
      System.out.println("Answer:" +
      list.stream()
          .mapToDouble(e -> e.getSalary())
          .reduce(0, (x,y) -> x+y));
      
      System.out.println("\n ***** 8)  Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this. *****");
      System.out.println("Answer:");
      list.stream()
          .map(e -> e.getFirstName())
          .forEach(System.out::println);

      System.out.println("\n ***** 9)  Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream. *****");
      IntStream.iterate(2, i -> i+2)
      		   .limit(20)
      		   .forEach(System.out::println);
      
      
      // **********************************************************************************************************************************************
      System.out.println(" ***** 3) Implement a method with the following signature and return type:");
      List<String> obj = new ArrayList<String>();
      obj.add("abc");
      obj.add("de");
      obj.add("fghi");
      obj.add("abe");
      System.out.println("Count:"+countWords(obj,'i','a',4));
      

   } // end main
   
   public static int countWords(List<String> words, char c, char d, int len) {  
	   return (int) words.stream()
	   	    .filter(w -> w.length()==len && w.indexOf(c)>=0 && w.indexOf(d)==-1)
	   	    .count();
   }
   
} // end class ProcessingEmployees


