import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Pre-filled student data: Roll No, Name, Marks
        String[][] students = {
            {"101", "Sachin", "85"},
            {"102", "Ram", "45"},
            {"103", "Krishna", "30"},
            {"100", "Alice",   "90"},
            {"199", "Bob",     "78"},
            {"198", "Charlie", "85"},
            {"104", "David",   "65"},
            {"105", "Eva",     "55"},
            {"106", "Frank",   "72"},
            {"107", "Grace",   "88"},
            {"108", "Helen",   "99"},
            {"109", "Ian",     "45"},
            {"110", "Jane",    "66"},
            {"111", "Kevin",   "52"},
            {"112", "Linda",   "47"},
            {"113", "Michael", "81"},
            {"114", "Nina",    "73"},
            {"115", "Oscar",   "60"},
            {"116", "Pam",     "85"},
            {"117", "Quincy",  "39"},
            {"118", "Rachel",  "92"},
            {"119", "Sam",     "68"},
            {"120", "Tina",    "80"},
            {"121", "Uma",     "74"},
            {"122", "Victor",  "83"},
            {"123", "Wendy",   "58"},
            {"124", "Xavier",  "49"},
            {"125", "Yvonne",  "77"},
            {"126", "Zach",    "91"},
            {"127", "Amber",   "84"},
            {"128", "Brian",   "67"},
            {"129", "Cathy",   "71"},
            {"130", "Derek",   "38"}

        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String inputName = scanner.nextLine();

        boolean found = false;
        for (String[] student : students) {
            if (student[1].equalsIgnoreCase(inputName)) {
                int marks = Integer.parseInt(student[2]);
                String status = marks >= 40 ? "Passed" : "Failed";
                System.out.println("Roll No: " + student[0]);
                System.out.println("Name: " + student[1]);
                System.out.println("Marks: " + marks);
                System.out.println("Status: " + status);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}