/*1.Create a Student class with fields like ID, name, marks.
2.Use ArrayList to store student objects.
3.Implement options: Add, View, Update, Delete*/
import java.util.*;

class Student {
    int id;
    String name;
    double marks;
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("1 Add");
            System.out.println("2 View");
            System.out.println("3 Update");
            System.out.println("4 Delete");
            System.out.println("5 Exit");

            choice = sc.nextInt();

            if (choice == 1) {

                Student s = new Student();

                System.out.print("Enter ID: ");
                s.id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter Marks: ");
                s.marks = sc.nextDouble();

                list.add(s);
                System.out.println("Added");

            } else if (choice == 2) {

                for (Student s : list) {
                    System.out.println(s.id + " " + s.name + " " + s.marks);
                }

            } else if (choice == 3) {

                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();

                for (Student s : list) {
                    if (s.id == id) {
                        sc.nextLine();
                        System.out.print("New Name: ");
                        s.name = sc.nextLine();
                        System.out.print("New Marks: ");
                        s.marks = sc.nextDouble();
                        System.out.println("Updated");
                    }
                }

            } else if (choice == 4) {

                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).id == id) {
                        list.remove(i);
                        System.out.println("Deleted");
                        break;
                    }
                }

            }

        } while (choice != 5);
    }
}
