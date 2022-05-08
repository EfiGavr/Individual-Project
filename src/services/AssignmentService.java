package services;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import models.Assignment;
import utils.Validation;

public class AssignmentService {

    static int counterA = 0;
    public static ArrayList<Assignment> assignmentsList = new ArrayList<>();

    public AssignmentService() {
    }

    public Assignment addAssignment() {

        Validation validation = new Validation();
        counterA = counterA + 1;
        int id = counterA;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Assignment's title");
        String title = scanner.nextLine();
        System.out.println("Give Assignment's description. Type A for Assignment" + "\n"
                + "and P for Project");
        String description0 = scanner.nextLine();
        String description = description0.toUpperCase();
        while ((!"A".equals(description)) && (!"P".equals(description))) {
            System.out.println("Wrong choice!!! Type A for Assignment and P for Project");
            description0 = scanner.nextLine();
            description = description0.toUpperCase();
        }

        // submition date time get and validation
        System.out.println("Give Assignment's submition's date and time at format yyyy-MM-dd HH:mm:ss");
        String subDateTime = scanner.nextLine();
        while (!validation.isValidLocalDateTime(subDateTime)) {
            System.out.println("Wrong input!!! Give Assignment's submition's date and time at format yyyy-MM-dd HH:mm:ss");
            subDateTime = scanner.nextLine();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime subDate = LocalDateTime.parse(subDateTime, formatter);

        // oral mark get and validation
        float oralMark = 0.0f;
        System.out.println("Give Assignment's oral mark");
        while (!scanner.hasNextFloat()) {
            System.out.println("Wrong input ! Assignment's oral mark should be a number. For decimal numbers use a '.' (dot) for decimal parts. Give the oral mark again.");
            scanner.nextLine();

        }
        oralMark = scanner.nextFloat();

        //total mark get and validation
        float totalMark = 0.0f;
        System.out.println("Give Assignment's total mark");
        while (!scanner.hasNextFloat()) {
            System.out.println("Wrong input ! Assignment's total mark should be a number. For decimal numbers use a ',' (comma) for decimal parts. Give the oral mark again.");
            scanner.nextLine();
        }
        totalMark = scanner.nextFloat();

        Assignment assignment = new Assignment(id, title, description, subDate, oralMark, totalMark);
        assignmentsList.add(assignment);

        return assignment;

    }

    public void printList() {

        for (int z = 0; z < assignmentsList.size(); z++) {
            System.out.println((assignmentsList.get(z)) + "\n");
        }
    }

    public ArrayList<Assignment> getAssignmentsList() {
        return assignmentsList;
    }

}
