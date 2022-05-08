package services;

import compinedIssues.AssignmentPerCourse;
import java.util.ArrayList;
import java.util.Scanner;
import models.Course;
import models.Assignment;
import syntheticdata.SyntheticData;

public class AssignmentPerCourseService {

    static CourseService cServ = new CourseService();
    static ArrayList<Course> coursesList = cServ.getCoursesList();
    static AssignmentService aServ = new AssignmentService();
    static ArrayList<Assignment> assignmentsList = aServ.getAssignmentsList();
    ArrayList<Assignment> nonPermanentListOfAssignments = new ArrayList<>();
    private AssignmentPerCourse aPerC = new AssignmentPerCourse();
    public static ArrayList<AssignmentPerCourse> listOfAssignmentsPerCourse = new ArrayList<>();

    public void makeAssignmentPerCourse(boolean synthetic) {
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        if (!synthetic) {
            assignments = assignmentsList;
            courses = coursesList;
        } else {
            SyntheticData syntheticData = new SyntheticData();
            assignments = syntheticData.getAllAssignments();
            courses = syntheticData.getAllCourseData();
        }
        System.out.println(" Courses' List :");
//        System.out.println(courses);
        for (int h = 0; h < courses.size(); h++) {
            System.out.println(courses.get(h) + "\n");

        }
        System.out.println("Type the id of the course you want to add assignments in");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("You choose course : " + courses.get(i - 1));

        aPerC.setCourse(courses.get(i - 1));
        aPerC.setId(i);

        boolean exit = false;
        do {
            System.out.println(" Assignments' List :");
//            System.out.println(assignments);
  for (int h = 0; h < assignments.size(); h++) {
            System.out.println(assignments.get(h) + "\n");

        }
            System.out.println("Type the id of the Assignment you want to add to the course");
            int k = sc.nextInt();
            assignments.get(k - 1);
            System.out.println("You choose assignment : " + assignments.get(k - 1));
            nonPermanentListOfAssignments.add(assignments.get(k - 1));
            System.out.println("Whould you like to add more assignments to this course?" + "\n"
                    + "Press 1 for yes and 0 for no");
            int answer = sc.nextInt();
            while ((answer != 1) && (answer != 0)) {
                System.out.println("Wrong choice !!! Whould you like to add more assignments " + "\n"
                        + "to this course? Press one for yes and 0 for no");
                answer = sc.nextInt();
            }
            if (answer == 0) {
                exit = true;
            }
        } while (exit == false);

        System.out.println("exit");
        System.out.println("The list of the Assignments for the course :" + courses.get(i - 1));
        System.out.println(nonPermanentListOfAssignments);

        boolean seeIfItWorks = false;
        for (int f = 0; f < listOfAssignmentsPerCourse.size(); f++) {
            if (listOfAssignmentsPerCourse.get(f).getCourse().getIdC() == courses.get(i - 1).getIdC()) {
                listOfAssignmentsPerCourse.get(f).getListOfAssignmentsForEachCourse().addAll(nonPermanentListOfAssignments);
                seeIfItWorks = true;
            }
        }
        if (seeIfItWorks) {
            System.out.println("You have added before assignments here");
        } else {
            System.out.println("It's the first time you add assignments to this course" + "\n");
            AssignmentPerCourse newAssignmentPerCourse = new AssignmentPerCourse(i, courses.get(i - 1), nonPermanentListOfAssignments);
            aPerC.setCourse(courses.get(i - 1));
            aPerC.setId(i);
            aPerC.getListOfAssignmentsForEachCourse().addAll(nonPermanentListOfAssignments);
            listOfAssignmentsPerCourse.add(newAssignmentPerCourse);
        }

        for (int z = 0; z < listOfAssignmentsPerCourse.size(); z++) {
            System.out.println((listOfAssignmentsPerCourse.get(z)) + "\n");
        }

    }

    public void printList() {

        for (int z = 0; z < listOfAssignmentsPerCourse.size(); z++) {
            System.out.println((listOfAssignmentsPerCourse.get(z)) + "\n");
        }
    }

    public static ArrayList<AssignmentPerCourse> getListOfAssignmentsPerCourse() {
        return listOfAssignmentsPerCourse;
    }

}
