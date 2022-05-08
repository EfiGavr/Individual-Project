package services;

import compinedIssues.TrainersPerCourse;
import java.util.ArrayList;
import java.util.Scanner;
import models.Course;
import models.Trainer;
import syntheticdata.SyntheticData;

public class TrainerPerCourseService {

    static CourseService cServ = new CourseService();
    static ArrayList<Course> coursesList = cServ.getCoursesList();
    static TrainerService tServ = new TrainerService();
    static ArrayList<Trainer> trainersList = tServ.getTrainersList();
    ArrayList<Trainer> nonPermanentListOfTrainers = new ArrayList<>();
    private TrainersPerCourse tPerC = new TrainersPerCourse();
    public static ArrayList<TrainersPerCourse> listOfTrainerssPerCourse = new ArrayList<>();

    public void makeTrainerPerCourse(boolean synthetic) {
        ArrayList<Trainer> trainers = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        if (!synthetic) {
            courses = coursesList;
            trainers = trainersList;
        } else {
            SyntheticData syntheticData = new SyntheticData();
            courses = syntheticData.getAllCourseData();
            trainers = syntheticData.getAllTrainerData();
        }
        System.out.println(" Courses' List :");
//        System.out.println(courses);
        for (int h = 0; h < courses.size(); h++) {
            System.out.println(courses.get(h) + "\n");

        }
        System.out.println("Type the id of the course you want to add trainers in");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("You choose course : " + courses.get(i - 1));

        tPerC.setCourse(courses.get(i - 1));
        tPerC.setId(i);

        boolean exit = false;

        do {
            System.out.println(" Trainers' List :");
//            System.out.println(trainers);
            for (int h = 0; h < trainers.size(); h++) {
                System.out.println(trainers.get(h) + "\n");

            }
            System.out.println("Type the id of the Trainer you want to add to the course");
            int k = sc.nextInt();
            trainers.get(k - 1);
            System.out.println("You choose trainer : " + trainers.get(k - 1));
            nonPermanentListOfTrainers.add(trainers.get(k - 1));
            System.out.println("Whould you like to add more trainers to this course?"
                    + "Press 1 for yes and 0 for no");
            int answer = sc.nextInt();
            while ((answer != 1) && (answer != 0)) {
                System.out.println("Wrong choice !!! Whould you like to add more trainers "
                        + "to this course? Press one for yes and 0 for no");
                answer = sc.nextInt();
            }
            if (answer == 0) {
                exit = true;
            }
        } while (exit == false);

        System.out.println("exit");
        System.out.println("The list of the Trainers for the course :" + courses.get(i - 1));
        System.out.println(nonPermanentListOfTrainers);

        boolean seeIfItWorks = false;
        for (int f = 0; f < listOfTrainerssPerCourse.size(); f++) {
            if (listOfTrainerssPerCourse.get(f).getCourse().getIdC() == courses.get(i - 1).getIdC()) {
                listOfTrainerssPerCourse.get(f).getListOfTrainersForEachCourse().addAll(nonPermanentListOfTrainers);
                seeIfItWorks = true;
            }
        }

        if (seeIfItWorks) {
            System.out.println("You have added before trainers here");
        } else {
            System.out.println("It's the first time you add trainers to this course" + "\n");
            TrainersPerCourse newTrainersPerCourse = new TrainersPerCourse(i, courses.get(i - 1), nonPermanentListOfTrainers);
            tPerC.setCourse(courses.get(i - 1));
            tPerC.setId(i);
            tPerC.getListOfTrainersForEachCourse().addAll(nonPermanentListOfTrainers);
            listOfTrainerssPerCourse.add(newTrainersPerCourse);
        }

        for (int z = 0; z < listOfTrainerssPerCourse.size(); z++) {
            System.out.println((listOfTrainerssPerCourse.get(z)) + "\n");
        }

    }

    public void printList() {

        for (int z = 0; z < listOfTrainerssPerCourse.size(); z++) {
            System.out.println((listOfTrainerssPerCourse.get(z)) + "\n");
        }
    }

    public static ArrayList<TrainersPerCourse> getListOfTrainersPerCourses() {
        return listOfTrainerssPerCourse;
    }

}
