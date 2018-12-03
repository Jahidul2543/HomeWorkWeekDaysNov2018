package Homework.Homework1;

public class Students {
    String nameOfStudent;
    int grade;
    String subject;

    public void displayStudentInfo() {
       System.out.println("Hi my name is " + nameOfStudent+ " i am in " + grade + " grade and i study " + subject);
    }

    public Students(String nameOfStudent, int grade, String subject) {
        this.nameOfStudent = nameOfStudent;
        this.grade = grade;
        this.subject = subject;
    }

    public static void main(String[] args) {


        Students student1 = new Students("Ziyad", 9, "English");
        student1.displayStudentInfo();
        Students student2 = new Students("Hamad", 8, "Physics");
        student2.displayStudentInfo();
        Students student3 = new Students("Shaukat", 7, "Science");
        student3.displayStudentInfo();
        Students student4 = new Students("Sapna", 6, "Math");
        student4.displayStudentInfo();

    }


    }



