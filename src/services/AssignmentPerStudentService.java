package services;

import compinedIssues.AssignmentPerStudent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import models.Assignment;
import models.Student;
import syntheticdata.SyntheticData;
import utils.Validation;

public class AssignmentPerStudentService {

    static StudentService sServ = new StudentService();
    static ArrayList<Student> studentsList = sServ.getStudentsList();
    static AssignmentService aServ = new AssignmentService();
    static ArrayList<Assignment> assignmentsList = aServ.getAssignmentsList();
    ArrayList<Assignment> nonPermanentListOfAssignments = new ArrayList<>();
    private AssignmentPerStudent aPerS = new AssignmentPerStudent();
    public static ArrayList<AssignmentPerStudent> listOfAssignmentsPerStudents = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();
    ArrayList<Student> studentWithAssInTheSameWeek = new ArrayList<>();

    public void makeAssignmentPerStudent(boolean synthetic) {
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        if (!synthetic) {
            assignments = assignmentsList;
            students = studentsList;
        } else {
            SyntheticData syntheticData = new SyntheticData();
            assignments = syntheticData.getAllAssignments();
            students = syntheticData.getAllStudentData();
        }

        System.out.println(" Students' List :");
//        System.out.println(students);
        for (int h = 0; h < students.size(); h++) {
            System.out.println(students.get(h) + "\n");

        }
        System.out.println("Type the id of the student you want to add assignments in");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("You choose student : " + students.get(i - 1));

        aPerS.setStudent(students.get(i - 1));
        aPerS.setId(i);

        boolean exit = false;
        do {
            System.out.println(" Assignments' List :");
//            System.out.println(assignments);
            for (int h = 0; h < assignments.size(); h++) {
                System.out.println(assignments.get(h) + "\n");

            }
            System.out.println("Type the id of the Assignment you want to add to the student");
            int k = sc.nextInt();
            assignments.get(k - 1);
            System.out.println("You choose assignment : " + assignments.get(k - 1));
            nonPermanentListOfAssignments.add(assignments.get(k - 1));
            System.out.println("Whould you like to add more assignments to this student?" + "\n"
                    + "Press 1 for yes and 0 for no");
            int answer = sc.nextInt();
            while ((answer != 1) && (answer != 0)) {
                System.out.println("Wrong choice !!! Whould you like to add more assignments " + "\n"
                        + "to this student? Press one for yes and 0 for no");
                answer = sc.nextInt();
            }
            if (answer == 0) {
                exit = true;
            }
        } while (exit == false);

        System.out.println("exit");
        System.out.println("The list of the Assignments for the student :" + students.get(i - 1));
        System.out.println(nonPermanentListOfAssignments);

        boolean seeIfItWorks = false;
        for (int f = 0; f < listOfAssignmentsPerStudents.size(); f++) {
            if (listOfAssignmentsPerStudents.get(f).getStudent().getId() == students.get(i - 1).getId()) {
                listOfAssignmentsPerStudents.get(f).getListOfAssignmentsForEachStudent().addAll(nonPermanentListOfAssignments);
                seeIfItWorks = true;
            }
        }

        if (seeIfItWorks) {
            System.out.println("You have added before assignments here");
        } else {
            System.out.println("It's the first time you add assignments to this student" + "\n");
            AssignmentPerStudent newAssignmentPerStudent = new AssignmentPerStudent(i, students.get(i - 1), nonPermanentListOfAssignments);
            aPerS.setStudent(students.get(i - 1));
            aPerS.setId(i);
            aPerS.getListOfAssignmentsForEachStudent().addAll(nonPermanentListOfAssignments);
            listOfAssignmentsPerStudents.add(newAssignmentPerStudent);
        }
        for (int z = 0; z < listOfAssignmentsPerStudents.size(); z++) {
            System.out.println((listOfAssignmentsPerStudents.get(z)) + "\n");
        }

    }

    public void printList() {

        for (int z = 0; z < listOfAssignmentsPerStudents.size(); z++) {
            System.out.println((listOfAssignmentsPerStudents.get(z)) + "\n");
        }
    }

    public static ArrayList<AssignmentPerStudent> getListOfAssignmentsPerStudents() {
        return listOfAssignmentsPerStudents;
    }

    public void compareDate(boolean synthetic) {

        ArrayList<Assignment> assignments = new ArrayList<>();

        if (!synthetic) {
            assignments = assignmentsList;
        } else {
            SyntheticData syntheticData = new SyntheticData();
            assignments = syntheticData.getAllAssignments();
        }

        System.out.println("Give Assignment's submition's date at format yyyy-MM-dd");
        String date = scanner.nextLine();
        while (!validation.isValidLocalDate(date)) {
            System.out.println("The start date should be at format 'yyyy-MM-dd'");
            date = scanner.nextLine();
        }
        LocalDate date2 = LocalDate.parse(date);

        TemporalField weekNumber = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int numberOfWeek = date2.get(weekNumber);

        for (AssignmentPerStudent assignmentPerStudent : listOfAssignmentsPerStudents) {
            int y = 0;
            for (Assignment assignment : assignments) {
                LocalDate dateOfStudent = assignment.getSubDateTime().toLocalDate();
                TemporalField week = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
                int weekNumberOfStudent = dateOfStudent.get(week);
                if (numberOfWeek == weekNumberOfStudent) {
                    y = y + 1;
                }
            }
            if (y > 0) {
                studentWithAssInTheSameWeek.add(assignmentPerStudent.getStudent());
            }
        }

        for (int z = 0; z < studentWithAssInTheSameWeek.size(); z++) {
            System.out.println((studentWithAssInTheSameWeek.get(z)) + "\n");
        }

    }



}
