package services;

import compinedIssues.StudentsPerCourse;
import java.util.ArrayList;
import java.util.Scanner;
import models.Course;
import models.Student;
import syntheticdata.SyntheticData;

public class StudentPerCourseService {

    static CourseService cServ = new CourseService();
    static ArrayList<Course> coursesList = cServ.getCoursesList();
    static StudentService sServ = new StudentService();
    static ArrayList<Student> studentsList = sServ.getStudentsList();
    ArrayList<Student> nonPermanentListOfStudents = new ArrayList<>();
    private StudentsPerCourse stPerC = new StudentsPerCourse();
    static int counterForStudentsPerCourse = 0;
    public static ArrayList<StudentsPerCourse> listOfStudentsPerCourse = new ArrayList<>();

    public void addStudentsToCourse(boolean synthetic) {
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        if (!synthetic) {
            courses = coursesList;
            students = studentsList;
        } else {
            SyntheticData syntheticData = new SyntheticData();
            courses = syntheticData.getAllCourseData();
            students = syntheticData.getAllStudentData();
        }
        System.out.println(" Courses' List :");
//        System.out.println(courses);
        for (int h = 0; h < courses.size(); h++) {
            System.out.println(courses.get(h) + "\n");

        }
        System.out.println("Type the id of the course you want to add students in");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("You choose course : " + courses.get(i - 1));

        stPerC.setCourse(courses.get(i - 1));
        stPerC.setId(i);

        boolean exit = false;

        do {
            System.out.println(" Students' List :");
//            System.out.println(students);
            for (int h = 0; h < students.size(); h++) {
                System.out.println(students.get(h) + "\n");

            }
            System.out.println("Type the id of the Student you want to add to the course");
            int k = sc.nextInt();
            students.get(k - 1);
            System.out.println("You choose student : " + students.get(k - 1));
            nonPermanentListOfStudents.add(students.get(k - 1));
            System.out.println("Whould you like to add more students to this course?" + "\n"
                    + "Press 1 for yes and 0 for no");
            int answer = sc.nextInt();
            while ((answer != 1) && (answer != 0)) {
                System.out.println("Wrong choice !!! Whould you like to add more students " + "\n"
                        + "to this course? Press one for yes and 0 for no");
                answer = sc.nextInt();
            }
            if (answer == 0) {
                exit = true;
            }
        } while (exit == false);
        System.out.println("exit");
        System.out.println("The list of the Students for the course :" + courses.get(i - 1));
        System.out.println(nonPermanentListOfStudents);

        boolean seeIfItWorks = false;
        for (int f = 0; f < listOfStudentsPerCourse.size(); f++) {
            if (listOfStudentsPerCourse.get(f).getCourse().getIdC() == courses.get(i - 1).getIdC()) {
                listOfStudentsPerCourse.get(f).getListOfStudentsForEachCourse().addAll(nonPermanentListOfStudents);
                seeIfItWorks = true;
            }
        }
        if (seeIfItWorks) {
            System.out.println("You have added before students here");
        } else {
            System.out.println("It's the first time you add students to this course" + "\n");
            StudentsPerCourse newStudentPerCourse = new StudentsPerCourse(i, courses.get(i - 1), nonPermanentListOfStudents);
            stPerC.setCourse(courses.get(i - 1));
            stPerC.setId(i);
            stPerC.getListOfStudentsForEachCourse().addAll(nonPermanentListOfStudents);
            listOfStudentsPerCourse.add(newStudentPerCourse);
        }

        for (int z = 0; z < listOfStudentsPerCourse.size(); z++) {
            System.out.println((listOfStudentsPerCourse.get(z)) + "\n");
        }
    }

    public void printList() {

        for (int z = 0; z < listOfStudentsPerCourse.size(); z++) {
            System.out.println((listOfStudentsPerCourse.get(z)) + "\n");
        }
    }

    public ArrayList<StudentsPerCourse> getListOfStudentsPerCourse() {
        return listOfStudentsPerCourse;
    }
}
