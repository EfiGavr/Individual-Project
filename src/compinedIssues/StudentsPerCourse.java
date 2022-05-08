/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compinedIssues;

import java.util.ArrayList;
import models.Course;
import models.Student;

/**
 *
 * @author Hp
 */
public class StudentsPerCourse {
    
    private int id;
    public Course course;
    private ArrayList<Student> listOfStudentsForEachCourse=new ArrayList<>();

    public StudentsPerCourse(int id, Course course, ArrayList<Student> listOfStudentsForEachCourse) {
 
        this.id = id;
        this.course = course;
        this.listOfStudentsForEachCourse = listOfStudentsForEachCourse;
        
    }

    public StudentsPerCourse() {
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getListOfStudentsForEachCourse() {
        return listOfStudentsForEachCourse;
    }


    public void addListOfStudentsForEachCourse(Student student) {
        this.listOfStudentsForEachCourse.add(student);
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "id=" + id + ", course=" + course + ", listOfStudentsForEachCourse=" + listOfStudentsForEachCourse + '}';
    }
    

  
//     static CourseService cServ=new CourseService();
//
//  
//    public void studentPerCourse() {
//
//        System.out.println("Courses' List : ");
//        System.out.println(coursesList);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write the id of the Course you want to add Students in");
//        int idCourse = scanner.nextInt();
//        boolean inputCheck = false;
//        do {
//            if ((idCourse < 0) && (idCourse > coursesList.size())) {
//                System.out.println("Invalid input. Try again");
//            } else {
//                inputCheck = true;
//            }
//        } while (inputCheck = false);
//        
//        do{
//        System.out.println("Students' List : ");
//        System.out.println(studentsList);
//        int decision=1;
//        System.out.println("Write the id of the Student you want to add to the course");
//        int idStudent = scanner.nextInt();
//        int inputCheck2 = 0;
//        do {
//            if ((idStudent < 0) && (idStudent > studentsList.size())) {
//                System.out.println("Invalid input. Try again");
//            } else {
//                inputCheck2 = 1;
//                System.out.println("Would you like to add more students to this course? "
//                        + "Press 1 to continue or 0 to stop.");
//                decision = scanner.nextInt();
//                while ((decision != 1) && (decision != 0)) {
//                    System.out.println("Wrong choice!!! Press 1 to continue or 0 to stop.");
//                    decision = scanner.nextInt();
//                }
//            }
//        } while(decision==0);
//        } while (inputCheck2 = 1);

   

  
}

//    public static ArrayList<Course> getCourses() {
//        return courses;
//    }
//}
