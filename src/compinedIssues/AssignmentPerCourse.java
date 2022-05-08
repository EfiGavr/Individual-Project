/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compinedIssues;

import java.util.ArrayList;
import models.Assignment;
import models.Course;

/**
 *
 * @author Hp
 */
public class AssignmentPerCourse {

    private int id;
    public Course course;
    private ArrayList<Assignment> listOfAssignmentsForEachCourse = new ArrayList<>();

    public AssignmentPerCourse(int id, Course course, ArrayList<Assignment> listOfAssignmentsForEachCourse) {

        this.listOfAssignmentsForEachCourse = listOfAssignmentsForEachCourse;
        this.id = id;
        this.course = course;
    }

    public AssignmentPerCourse() {
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

    public ArrayList<Assignment> getListOfAssignmentsForEachCourse() {
        return listOfAssignmentsForEachCourse;
    }

    public void setListOfAssignmentsForEachCourse(ArrayList<Assignment> listOfAssignmentsForEachCourse) {
        this.listOfAssignmentsForEachCourse = listOfAssignmentsForEachCourse;
    }

    @Override
    public String toString() {
        return "AssignmentPerCourse{" + "id=" + id + ", course=" + course + ", listOfAssignmentsForEachCourse=" + listOfAssignmentsForEachCourse + '}';
    }

}
