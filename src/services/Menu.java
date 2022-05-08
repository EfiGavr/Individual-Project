package services;

import compinedIssues.AssignmentPerStudent;
import java.util.Scanner;
import syntheticdata.SyntheticData;


public class Menu {
   
    
    SyntheticData syntheticData=new SyntheticData();
//    TrainerPerCourseService trainerperCourse=new TrainerPerCourseService();
//    AssignmentPerCourseService assignmentperCourse=new AssignmentPerCourseService();
//    StudentService studentService=new StudentService();
//    AssignmentPerStudentService assignmentperStudent=new AssignmentPerStudentService();
//    
    
    public Menu mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 1 for new registration, 2 for using synthetic data,"
                + "and 0 for terminating the programm");
        int entry1 = sc.nextInt();
        while ((entry1 != 1) && (entry1 != 2) && (entry1 != 0)) {
            System.out.println("Wrong choice!!! Give 1 for new registration, 2 for using "
                    + "synthetic data, and 0 for terminating the programm");
            entry1 = sc.nextInt();
        }
        if (entry1 != 0) {
            do {
                if (entry1 == 1) {
                    System.out.println("\n" + "Give 3 for adding new Student, "+"\n"
                            + "4 adding new Trainer, "+"\n"
                            + "5 for adding new Course" +"\n"
                            + "6 for adding new Assignment" +"\n"
                            +"7 for adding Students to a Course that already exist"+"\n"
                            +"8 for adding Trainers to a Course that already exist"+"\n"
                            +"9 for adding Assignments to a Course that already exist"+"\n"
                            +"10 for adding Assignments to a Student that already exist"+"\n"
                            +"11 for printing the students that has to submit assignments the same week with a given date"+"\n"
                            +"12 for printing Students that belong to more than one courses' List"+"\n"
                            + "and 0 for terminating the programm");
                    int entry2 = sc.nextInt();
                    while ((entry2 != 3) && (entry2 != 4) && (entry2 != 5) && (entry2 != 6) && (entry2 != 0) && (entry2 != 7) && (entry2 != 8) && (entry2 != 9) && (entry2 != 10)&& (entry2 != 11) && (entry2 != 12)) {
                        System.out.println("Wrong choice!!! Give 3 for adding new Student, "+"\n"
                                + "4 adding new Trainer, "+"\n"
                                + "5 for adding new Course"+"\n"
                                + "6 for adding new Assignment"+"\n"
                                +"7 for adding Students to a Course that already exist"+"\n"
                                +"8 for adding Trainers to a Course that already exist"+"\n"
                                +"9 for adding Assignments to a Course that already exist"+"\n"
                                +"10 for adding Assignments to a Student that already exist"+"\n"
                                +"11 for printing the students that has to submit assignments the same week with a given date"+"\n"
                                +"12 for printing Students that belong to more than one courses' List"+"\n"
                                + "and 0 for terminating the programm");
                        entry2 = sc.nextInt();
                    }
                    switch (entry2) {
                        case 3:
                            System.out.println("Call Student");
                            StudentService studentService=new StudentService();
                            studentService.addStudent();
                            
                            break;
                        case 4:
                            System.out.println("Call Trainer");
                            TrainerService trainerService=new TrainerService();
                            trainerService.addTrainer();
                            break;
                        case 5:
                            System.out.println("Call Course");
                            CourseService courseService=new CourseService();
                            courseService.addCourse();
                            
                            break;
                        case 6:
                            System.out.println("Call Assignment");
                            AssignmentService assignmentService=new AssignmentService();
                            assignmentService.addAssignment();
                            break;
                        case 7:
                            System.out.println("Call StudentPerCourse");
                            StudentPerCourseService studentperCourse=new StudentPerCourseService();
                            studentperCourse.addStudentsToCourse(false);
                            break;
                        case 8:
                            System.out.println("Call TrainerPerCourse");
                            TrainerPerCourseService trainerperCourse=new TrainerPerCourseService();
                            trainerperCourse.makeTrainerPerCourse(false);
                            break;
                        case 9:
                            System.out.println("Call AssignmentPerCourse");
                            AssignmentPerCourseService assignmentPerCourseService = new AssignmentPerCourseService();
                            assignmentPerCourseService.makeAssignmentPerCourse(false);
                            break;
                        case 10:
                            System.out.println("Call AssignmentPerStudent");
                            AssignmentPerStudentService assignmentPerStudentService = new AssignmentPerStudentService();
                            assignmentPerStudentService.makeAssignmentPerStudent(false);
                            break;
                        case 11:
                            System.out.println("Print Assignments with same week submition date");
                                AssignmentPerStudentService sameDates=new AssignmentPerStudentService();
                            sameDates.compareDate(false);
                            break;
                        case 12:
                            System.out.println("Print Students that belong to more than one courses' List");
                            StudentService studentService1 = new StudentService();
                            studentService1.printListOfStudentsWithManyCourses(false);
                            break;
                        default:
                            entry1 = 0;
                            break;
                    }
                } else if (entry1 == 2) {
                    System.out.println("Give 7 for all Students' list, "+"\n"
                                + "8 for all Trainers' list, "+"\n"
                                + "9 for all Courses' list"+"\n"
                                + "10 for all Assignments' list"+"\n"
                                +"11 for add Students Per Course"+"\n"
                                +"12 for printing the List of Students Per Course"+"\n"
                                +"13 for add Trainers Per Course"+"\n"
                                +"14 for printing the List of Trainers Per Course"+"\n"
                                +"15 for add Assignments Per Course"+"\n"
                                +"16 for printing the List of Assignments Per Course"+"\n"
                                +"17 for printing the List of Students that belong to more than one courses"+"\n"
                                +"18 for add Assignments Per Student"+"\n"
                                +"19 for printing the List of Assignments Per Student"+"\n"                           
                                +"20 for printing the list of Students that have to submit assignment the same week with a given date"+"\n"                           
                                + "and 0 for terminating the programm");
                     int entry3 = sc.nextInt();
                      while ((entry3 != 7) && (entry3 != 8) && (entry3 != 9) && (entry3 != 10) && (entry3 != 11) && (entry3 != 12)&& (entry3 != 13)&& (entry3 != 14)&& (entry3 != 0)&& (entry3 != 15)&& (entry3 != 16)&& (entry3 != 17)&& (entry3 != 18)&& (entry3 != 19)&& (entry3 != 20)) {
                        System.out.println("Wrong choice!!! Give 7 for all Students' list, "+"\n"
                                + "8 for all Trainers' list, "+"\n"
                                + "9 for all Courses' list"+"\n"
                                + "10 for all Assignments' list"+"\n"
                                +"11 for add Students Per Course"+"\n"
                                +"12 for printing the List of Students Per Course"+"\n"
                                +"13 for add Trainers Per Course"+"\n"
                                +"14 for printing the List of Trainers Per Course"+"\n"
                                +"15 for add Assignments Per Course"+"\n"
                                +"16 for printing the List of Assignments Per Course"+"\n"
                                +"17 for printing the List of Students that belong to more than one courses"+"\n"
                                +"18 for add Assignments Per Student"+"\n"
                                +"19 for printing the List of Assignments Per Student"+"\n"                              
                                +"20 for printing the list of Students that have to submit assignment the same week with a given date"+"\n"  
                                + "and 0 for terminating the programm");
                        entry3 = sc.nextInt();
                    }
                      switch (entry3) {
                        case 7:
                            System.out.println("Student's Synthetic data list : " +"\n");
                            syntheticData.getAndPrintAllStudentData();
                            break;
                        case 8:
                            System.out.println("Call Trainer's Synthetic data list");
                            syntheticData.getAndPrintAllTrainerData();
                            break;
                        case 9:
                            System.out.println("Call Course's Synthetic data list");
                            syntheticData.getAndPrintAllCourseData();
                            break;
                        case 10:
                            System.out.println("Call Assignment's Synthetic data list");
                            syntheticData.getAndPrintAllAssignmentData();
                            break;
                        case 11:
                            System.out.println("Add  Students To Course's Synthetic data");
                            StudentPerCourseService studentPerCourseService = new StudentPerCourseService();
                            studentPerCourseService.addStudentsToCourse(true);
                            break;
                        case 12:
                            System.out.println("Call  Students Per Course's Synthetic data list");
                            StudentPerCourseService studentperCourse=new StudentPerCourseService();
                            studentperCourse.printList();
                            break;
                        case 13:
                            System.out.println("Add Trainers Per Course's Synthetic data");
                            TrainerPerCourseService trainerPerCourseService = new TrainerPerCourseService();
                            trainerPerCourseService.makeTrainerPerCourse(true);                            
                            break;
                        case 14:
                            System.out.println("Call Trainers Per Course's Synthetic data list");
                            TrainerPerCourseService trainerPerCourseService1 = new TrainerPerCourseService();
                            trainerPerCourseService1.printList();                          
                            break;
                        case 15:
                            System.out.println("Add Assignments Per Course's Synthetic data");
                            AssignmentPerCourseService assignmentPerCourseService = new AssignmentPerCourseService();
                            assignmentPerCourseService.makeAssignmentPerCourse(true);
                            break;
                        case 16:
                            System.out.println("Call Assignment Per Course's Synthetic data list");
                            AssignmentPerCourseService assignmentPerCourseService1 = new AssignmentPerCourseService();
                            assignmentPerCourseService1.printList();
                            break;
                        case 18:
                            System.out.println("Call AssignmentPerStudent");
                            AssignmentPerStudentService assignmentPerStudentService = new AssignmentPerStudentService();
                            assignmentPerStudentService.makeAssignmentPerStudent(true);
                            break;
                        case 19:
                            System.out.println("Print AssignmentPerStudent");
                            AssignmentPerStudentService assignmentPerStudentService1 = new AssignmentPerStudentService();
                            assignmentPerStudentService1.printList();
                            break;
                        case 17:
                            System.out.println("Print Students that belong to more than one courses' Synthetic data list");
                            StudentService studentService = new StudentService();
                            studentService.printListOfStudentsWithManyCourses(true);
                            break;
                        case 20:
                            System.out.println("Print the list of Students that have to submit assignment the same week with a given date");
                            AssignmentPerStudentService sameDates=new AssignmentPerStudentService();
                            sameDates.compareDate(true);
                            break;
                        default:
                            entry1 = 0;
                            break;
                    }
                      

                }

            } while (entry1 != 0);
             System.out.println("Termination of the programm");
             
        } else {
            System.out.println("Termination of the programm");


                
        }
        System.out.println("Give 1 for printing your data, 2 for using synthetic data, and 0 for terminating the programm");
        int entryFinal = sc.nextInt();
        while ((entryFinal != 1) && (entryFinal != 0)) {
            System.out.println("Wrong choice!!! Give 1 for printing your data, "
                    + " and 0 for terminating the programm");
            entryFinal = sc.nextInt();
        }
        if(entryFinal!=0){
        do{ 
            System.out.println("\n" + "Give 3 for printing Students' List, "+"\n"
                            + "4 for printing Trainers' List, "+"\n"
                            + "5 for printing Courses' List" +"\n"
                            + "6 for printing Assignments' List" +"\n"
                            +"7 for printing the List of Students Per Course"+"\n"
                            +"8 for printing the List of Trainers Per Course"+"\n"
                            +"9 for printing the List of Assignments Per Course"+"\n"
                            +"10 for printing the List of Assignments Per Students"+"\n"
                            +"11 for printing the List of Students that belong to more than one courses"+"\n"
                            + "and 0 for terminating the programm");
                    int entryF = sc.nextInt();
                    while ((entryF != 3) && (entryF != 4) && (entryF != 5) && (entryF != 6) && (entryF != 7) && (entryF != 8) && (entryF != 9) && (entryF != 10) && (entryF !=11) && (entryF != 0)) {
                        System.out.println("Wrong choice !!! Give 3 for printing Students' List, "+"\n"
                            + "4 for printing Trainers' List, "+"\n"
                            + "5 for printing Courses' List" +"\n"
                            + "6 for printing Assignments' List" +"\n"
                            +"7 for printing the List of Students Per Course"+"\n"
                            +"8 for printing the List of Trainers Per Course"+"\n"
                            +"9 for printing the List of Assignments Per Course"+"\n"
                            +"10 for printing the List of Assignments Per Students"+"\n"
                            +"11 for printing the List of Students that belong to more than one courses"+"\n"
                            + "and 0 for terminating the programm");
                        entryF = sc.nextInt();
                    }
                                switch (entryF) {
                        case 3:
                            System.out.println("Students' List :"+"\n");
                            StudentService addStudent=new StudentService();
                            addStudent.printList();
                            
                            break;
                        case 4:
                            System.out.println("Trainers' List :"+"\n");
                            TrainerService addTrainer=new TrainerService();
                            addTrainer.printList();
                            break;
                        case 5:
                            System.out.println("Courses' List :"+"\n");
                            CourseService addCourse=new CourseService();
                            addCourse.printList();
                            
                            break;
                        case 6:
                            System.out.println("Assignments' List :"+"\n");
                            AssignmentService addAssignment=new AssignmentService();
                            addAssignment.printList();
                            break;
                        case 7:
                            System.out.println("Students per courses' List :"+"\n");
                            StudentPerCourseService studentperCourse=new StudentPerCourseService();
                            studentperCourse.printList();
                            break;
                        case 8:
                            System.out.println("Trainers per courses' List :"+"\n");
                            TrainerPerCourseService trainerperCourse=new TrainerPerCourseService();
                            trainerperCourse.printList();
                            break;
                        case 9:
                            System.out.println("Assignments per courses' List :"+"\n");
                            AssignmentPerCourseService assignmentperCourse=new AssignmentPerCourseService();
                            assignmentperCourse.printList();
                            break;
                        case 10:
                            System.out.println("Assignments per Students' List :"+"\n");
                            AssignmentPerStudentService assignmentperStudent=new AssignmentPerStudentService();
                            assignmentperStudent.printList();
                            break;
                        case 11:
                            System.out.println("Students that belong to more than one courses' List :"+"\n");  
                            StudentService studentService = new StudentService();
                            studentService.printListOfStudentsWithManyCourses(false);
                            break;
                        default:
                            entryFinal = 0;
                            break;
                    }
                    
                    
        }
        while (entryFinal != 0);
        
        
        
        
        
        }
        else {
            System.out.println("Final Termination of the programm");
        
        }
        Menu menu = new Menu();
        return menu; 
    
    }
}
