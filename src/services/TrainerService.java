package services;

import java.util.ArrayList;
import java.util.Scanner;
import models.Trainer;

public class TrainerService {

    static int counterT = 0;
    public static ArrayList<Trainer> trainersList = new ArrayList<>();

    public TrainerService() {
    }

    public Trainer addTrainer() {

        counterT = counterT + 1;
        int idT = counterT;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give trainer's first name");
        String firstName = scanner.nextLine();

        System.out.println("Give trainer's last name");
        String lastName = scanner.nextLine();

        System.out.println("Give trainer's course");
        String subject = scanner.nextLine();

        Trainer trainer = new Trainer(idT, firstName, lastName, subject);

        trainersList.add(trainer);
        return trainer;
    }

    public void printList() {

        for (int z = 0; z < trainersList.size(); z++) {
            System.out.println((trainersList.get(z)) + "\n");
        }
    }

    public ArrayList<Trainer> getTrainersList() {   
        return trainersList;
    }

}
