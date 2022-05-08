package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import models.Course;
import utils.Validation;

public class CourseService {

    static int counterC = 0;
    public static ArrayList<Course> coursesList = new ArrayList<>();

    public CourseService() {
    }

    public Course addCourse() {
        counterC = counterC + 1;
        int idC = counterC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give course's title");
        String title = scanner.nextLine();
        System.out.println("Give course's type");
        String type = scanner.nextLine();

        System.out.println("Give course's stream");
        String stream = scanner.nextLine();

        Validation validation = new Validation();

        // course's start date - format validation
        System.out.println("Give course's start date");
        String startDate = scanner.nextLine();
        while (!validation.isValidLocalDate(startDate)) {
            System.out.println("The start date should be at format 'yyyy-MM-dd'");
            startDate = scanner.nextLine();
        }
        LocalDate startingDate = LocalDate.parse(startDate);

        // course's end date - format validation
        System.out.println("Give course's end date");
        String endDate = scanner.nextLine();
        while (!validation.isValidLocalDate(endDate)) {
            System.out.println("The end date should be at format 'yyyy-MM-dd'");
            endDate = scanner.nextLine();
        }
        LocalDate endingDate = LocalDate.parse(endDate);

        // start and end date validation - compare dates, end date should be after start date 
        int compareValue = endingDate.compareTo(startingDate);

        while (!(compareValue > 0)) {
            if (compareValue > 0) {
                System.out.println("Ending is later than starting");
            } else if (compareValue < 0) {
                System.out.println("Ending is earlier than starting. Try again");
                System.out.println("Give course's start date");
                startDate = scanner.nextLine();

                System.out.println("Give course's end date");
                endDate = scanner.nextLine();

                startingDate = LocalDate.parse(startDate);

                endingDate = LocalDate.parse(endDate);

                compareValue = endingDate.compareTo(startingDate);
            } else {
                System.out.println("Both dates are equal");
                System.out.println("Give course's start date");
                startDate = scanner.nextLine();

                System.out.println("Give course's end date");
                endDate = scanner.nextLine();

                startingDate = LocalDate.parse(startDate);
                endingDate = LocalDate.parse(endDate);

                compareValue = endingDate.compareTo(startingDate);
            }
        }
        Course course = new Course(idC, title, type, stream, startingDate, endingDate);
        coursesList.add(course);

        return course;
    }

    public void printList() {

        for (int z = 0; z < coursesList.size(); z++) {
            System.out.println((coursesList.get(z)) + "\n");
        }
    }

    public ArrayList<Course> getCoursesList() {
        return coursesList;
    }
}
