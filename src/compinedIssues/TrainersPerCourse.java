/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compinedIssues;

import java.util.ArrayList;
import models.Course;
import models.Trainer;

/**
 *
 * @author Hp
 */
public class TrainersPerCourse {

    private int id;
    public Course course;
    private ArrayList<Trainer> listOfTrainersForEachCourse = new ArrayList<>();

    public TrainersPerCourse(int id, Course course, ArrayList<Trainer> listOfTrainersForEachCourse) {

        this.id = id;
        this.course = course;
        this.listOfTrainersForEachCourse = listOfTrainersForEachCourse;
    }

    public TrainersPerCourse() {
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

    public ArrayList<Trainer> getListOfTrainersForEachCourse() {
        return listOfTrainersForEachCourse;
    }

    public void setListOfTrainersForEachCourse(ArrayList<Trainer> listOfTrainersForEachCourse) {
        this.listOfTrainersForEachCourse = listOfTrainersForEachCourse;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "id=" + id + ", course=" + course + ", listOfTrainersForEachCourse=" + listOfTrainersForEachCourse + '}';
    }

}
