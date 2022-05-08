package syntheticdata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import models.Assignment;
import models.Course;
import models.Student;
import models.Trainer;

public class SyntheticData {

    public ArrayList<Student> getAndPrintAllStudentData() {
        ArrayList<Student> allStudents = getAllStudentData();
        for (int i = 0; i < allStudents.size(); i++) {
            System.out.println(allStudents.get(i) + "\n");
        }
        return allStudents;

    }
    
     public ArrayList<Course> getAndPrintAllCourseData() {
        ArrayList<Course> allCourses = getAllCourseData();
        for (int i = 0; i < allCourses.size(); i++) {
            System.out.println(allCourses.get(i) + "\n");
        }
        return allCourses;

    }
     
      public ArrayList<Trainer> getAndPrintAllTrainerData() {
        ArrayList<Trainer> allTrainers = getAllTrainerData();
        for (int i = 0; i < allTrainers.size(); i++) {
            System.out.println(allTrainers.get(i) + "\n");
        }
        return allTrainers;

    }
      
       public ArrayList<Assignment> getAndPrintAllAssignmentData() {
        ArrayList<Assignment> allAssignments = getAllAssignments();
        for (int i = 0; i < allAssignments.size(); i++) {
            System.out.println(allAssignments.get(i) + "\n");
        }
        return allAssignments;

    }

    public ArrayList<Student> getAllStudentData() {

        ArrayList<Student> allStudents = new ArrayList<>();
        Student s1 = new Student(1, "Efi", "Gavrielatou", LocalDate.of(1993, Month.MARCH, 15), 2500);
        allStudents.add(s1);
        Student s2 = new Student(2, "Maria", "Fotoglidou", LocalDate.of(1992, Month.FEBRUARY, 22), 2500);
        allStudents.add(s2);
        Student s3 = new Student(3, "Eleni", "Routsia", LocalDate.of(1990, Month.JANUARY, 2), 2500);
        allStudents.add(s3);
        Student s4 = new Student(4, "Aris", "Gavrielatos", LocalDate.of(1993, Month.APRIL, 18), 2500);
        allStudents.add(s4);
        Student s5 = new Student(5, "Eftixia", "Rontou", LocalDate.of(1989, Month.MARCH, 20), 2500);
        allStudents.add(s5);
        Student s6 = new Student(6, "Dina", "Gotsi", LocalDate.of(1991, Month.OCTOBER, 10), 2500);
        allStudents.add(s6);
        Student s7 = new Student(7, "Efi", "Papagianni", LocalDate.of(1992, Month.NOVEMBER, 1), 2500);
        allStudents.add(s7);
        Student s8 = new Student(8, "Vaggelis", "Pappas", LocalDate.of(1990, Month.NOVEMBER, 8), 2500);
        allStudents.add(s8);
        Student s9 = new Student(9, "Roman", "Hagos", LocalDate.of(1994, Month.MAY, 25), 2500);
        allStudents.add(s9);
        Student s10 = new Student(10, "Pantelis", "Logothetis", LocalDate.of(1992, Month.NOVEMBER, 30), 2500);
        allStudents.add(s10);
        Student s11 = new Student(11, "Giwrgos", "Azakas", LocalDate.of(1988, Month.AUGUST, 5), 2500);
        allStudents.add(s11);
        Student s12 = new Student(12, "Dimitris", "Papadogiannakis", LocalDate.of(1992, Month.NOVEMBER, 28), 2500);
        allStudents.add(s12);
        Student s13 = new Student(13, "Giwrgos", "Karatzas", LocalDate.of(1999, Month.SEPTEMBER, 22), 2500);
        allStudents.add(s13);
        Student s14 = new Student(14, "Antonis", "Katsakos", LocalDate.of(1992, Month.JUNE, 11), 2500);
        allStudents.add(s14);
        Student s15 = new Student(15, "Andreas", "Mpourzoukos", LocalDate.of(1993, Month.DECEMBER, 19), 2500);
        allStudents.add(s15);
        Student s16 = new Student(16, "Andreas", "Tsarouxas", LocalDate.of(1988, Month.APRIL, 27), 2500);
        allStudents.add(s16);
        Student s17 = new Student(17, "Dafni", "Aggelaki", LocalDate.of(1990, Month.DECEMBER, 19), 2500);
        allStudents.add(s17);
        Student s18 = new Student(18, "Grigoris", "Ladas", LocalDate.of(1991, Month.NOVEMBER, 6), 2500);
        allStudents.add(s18);
        Student s19 = new Student(19, "Jenny", "Rapti", LocalDate.of(1993, Month.OCTOBER, 17), 2500);
        allStudents.add(s19);
        Student s20 = new Student(20, "Vasiliki", "Mpoumpouri", LocalDate.of(1995, Month.DECEMBER, 24), 2500);
        allStudents.add(s20);
        return allStudents;

    }

    public ArrayList<Trainer> getAllTrainerData() {
        ArrayList<Trainer> allTrainers = new ArrayList<>();
        Trainer t1 = new Trainer(1, "Gewrgios", "Pasparakis", "Java");
        allTrainers.add(t1);
        Trainer t2 = new Trainer(2, "Gewrgios", "Iraklidis", "Java");
        allTrainers.add(t2);
        Trainer t3 = new Trainer(3, "Ioannis", "Mantoudis", "JavaScript");
        allTrainers.add(t3);
        Trainer t4 = new Trainer(4, "Antonios", "Thodos", "My-Sql");
        allTrainers.add(t4);
        Trainer t5 = new Trainer(5, "Rafaila", "Galanopoulou", "Python");
        allTrainers.add(t5);
        Trainer t6 = new Trainer(6, "Sofia", "Giakoumatou", "JavaScript");
        allTrainers.add(t6);
        Trainer t7 = new Trainer(7, "Eleni", "Mavridou", "Python");
        allTrainers.add(t7);
        Trainer t8 = new Trainer(8, "Kwnstantinos", "Golemis", "My-Sql");
        allTrainers.add(t8);

//        for (int i = 0; i < allTrainers.size(); i++) {
//            System.out.println(allTrainers.get(i) + "\n");
//        }
        return allTrainers;

    }

    public ArrayList<Course> getAllCourseData() {
        ArrayList<Course> allCourses = new ArrayList<>();
        Course c1 = new Course(1, "CB8", "full-time", "Java", LocalDate.of(2022, Month.FEBRUARY, 15), LocalDate.of(2022, Month.SEPTEMBER, 15));
        allCourses.add(c1);
        Course c2 = new Course(2, "CB8", "part-time", "Java", LocalDate.of(2022, Month.FEBRUARY, 15), LocalDate.of(2022, Month.JUNE, 15));
        allCourses.add(c2);
        Course c3 = new Course(3, "CB8", "part-time", "C", LocalDate.of(2022, Month.MARCH, 15), LocalDate.of(2022, Month.OCTOBER, 15));
        allCourses.add(c3);
        Course c4 = new Course(4, "CB8", "full-time", "C", LocalDate.of(2022, Month.FEBRUARY, 15), LocalDate.of(2022, Month.SEPTEMBER, 15));
        allCourses.add(c4);

//        for (int i = 0; i < allCourses.size(); i++) {
//            System.out.println(allCourses.get(i) + "\n");
//        }
        return allCourses;
    }

    public ArrayList<Assignment> getAllAssignments() {
        ArrayList<Assignment> allAssignments = new ArrayList<>();

        Assignment a1 = new Assignment(1, "Assignment1", "A", LocalDateTime.of(2022, Month.MARCH, 14, 23, 59, 59), 100, 100);
        allAssignments.add(a1);
        Assignment a2 = new Assignment(2, "Assignment2", "A", LocalDateTime.of(2022, Month.MARCH, 15, 23, 59, 59), 100, 100);
        allAssignments.add(a2);
        Assignment a3 = new Assignment(3, "Assignment3", "A", LocalDateTime.of(2022, Month.JUNE, 13, 23, 59, 59), 100, 100);

        allAssignments.add(a3);
        Assignment a4 = new Assignment(4, "Assignment4", "A", LocalDateTime.of(2022, Month.AUGUST, 15, 23, 59, 59), 100, 100);
        allAssignments.add(a4);
        Assignment a5 = new Assignment(5, "Assignment5", "A", LocalDateTime.of(2022, Month.MARCH, 18, 23, 59, 59), 100, 100);
        allAssignments.add(a5);
        Assignment a6 = new Assignment(6, "Project1", "P", LocalDateTime.of(2022, Month.OCTOBER, 13, 23, 59, 59), 100, 100);
        allAssignments.add(a6);
        Assignment a7 = new Assignment(7, "Project2", "P", LocalDateTime.of(2022, Month.MARCH, 21, 23, 59, 59), 100, 100);
        allAssignments.add(a7);

//        for (int i = 0; i < allAssignments.size(); i++) {
//            System.out.println(allAssignments.get(i) + "\n");
//        }
        return allAssignments;
    }

}
