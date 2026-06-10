import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    double marks;

    Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);

    }
}

public class StudentSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Calculate Average Mark");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                   for(int i=0;i<students.size();i++){
					   students.get(i).display();
				   }
                    break;

                case 3:
                    System.out.println("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();
                    
					for(int i=0;i<students.size();i++){
						if(students.get(i).studentId==searchId){
							students.get(i).display();
						}
					}
                    break;

                case 4:
                    double total=0;
					
					for(int i=0;i<students.size();i++){
						total+=students.get(i).marks;
					}
					System.out.println("Average Mark = "+(total/students.size()));
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

       
    }
}