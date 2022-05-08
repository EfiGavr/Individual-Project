package services;

import compinedIssues.StudentsPerCourse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import models.Student;
import syntheticdata.SyntheticData;
import utils.Validation;

public class StudentService {

    static int counter = 0;
    public static ArrayList<Student> studentsList = new ArrayList<>();
    static StudentPerCourseService studentPerCourseService = new StudentPerCourseService();

    public Student addStudent() {

        Student student = new Student();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give first name");
            String fname = scanner.nextLine();

            System.out.println("Give last name");
            String lname = scanner.nextLine();

            System.out.println("Give date of birth yyyy-MM-dd");
            String dateOfBirth = scanner.nextLine();

            Validation validation = new Validation();

            // birth date format get and validation
            while (!validation.isValidLocalDate(dateOfBirth)) {
                System.out.println("The date of birth should be at format 'yyyy-MM-dd'");
                dateOfBirth = scanner.nextLine();
            }
            LocalDate date = LocalDate.parse(dateOfBirth);

            // tuition fees get and validation
            Double tuitionFees = 0.0;
            System.out.println("Give tuition fees");
            while (!scanner.hasNextDouble()) {

                System.out.println("Wrong input! Tuition fees should be a number. For decimal numbers use a ',' (comma) for decimal parts");
                scanner.nextLine();
            }
            tuitionFees = scanner.nextDouble();

            counter = counter + 1;
            int id = counter;

            student.setId(id);
            student.setFname(fname);
            student.setLname(lname);
            student.setDateOfBirth(date);
            student.setTuitionFees(tuitionFees);

            studentsList.add(student);
        } catch (Exception e) {
            System.out.println("wrong input");
            counter = counter - 1;
        }
        return student;

    }

    public void printList() {

        for (int z = 0; z < studentsList.size(); z++) {
            System.out.println((studentsList.get(z)) + "\n");
        }
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void printListOfStudentsWithManyCourses(boolean synthetic) {
        ArrayList<Student> students = new ArrayList<>();
        if (!synthetic) {
            students = studentsList;
        } else {
            SyntheticData syntheticData = new SyntheticData();
            students = syntheticData.getAllStudentData();
        }
        ArrayList<Student> listOfStudentsBelogsToManyCourses = new ArrayList<>();
        // list with all students per course
        ArrayList<StudentsPerCourse> studentsPerCourseList = studentPerCourseService.getListOfStudentsPerCourse();

        for (int i = 0; i < students.size(); i++) {
            int counter = 0;
            for (int y = 0; y < studentsPerCourseList.size(); y++) {
                Student instanceStudent = students.get(i); // student at index i
                ArrayList<Student> instanceStudentsListPerCourse = studentsPerCourseList.get(y).getListOfStudentsForEachCourse(); // list of students in StudentsPerCourse list [y]
                for (int j = 0; j < instanceStudentsListPerCourse.size(); j++) {
                    if (instanceStudent.getId() == instanceStudentsListPerCourse.get(j).getId()) {
                        counter = counter + 1;
                    }
                }
            }
            if (counter >= 2) {
                listOfStudentsBelogsToManyCourses.add(students.get(i));
            }

        }
        for (int k = 0; k < listOfStudentsBelogsToManyCourses.size(); k++) {

            System.out.println(listOfStudentsBelogsToManyCourses.get(k) + "\n");

        }
    }

}
