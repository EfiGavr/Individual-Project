/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compinedIssues;

import java.util.ArrayList;
import models.Assignment;
import models.Student;

/**
 *
 * @author Hp
 */
public class AssignmentPerStudent {

    private int id;
    public Student student;
    private ArrayList<Assignment> listOfAssignmentsForEachStudent = new ArrayList<>();

    public AssignmentPerStudent(int id, Student student, ArrayList<Assignment> listOfAssignmentsForEachStudent) {

        this.listOfAssignmentsForEachStudent = listOfAssignmentsForEachStudent;
        this.id = id;
        this.student = student;
    }

    public AssignmentPerStudent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Assignment> getListOfAssignmentsForEachStudent() {
        return listOfAssignmentsForEachStudent;
    }

    public void setListOfAssignmentsForEachStudent(ArrayList<Assignment> listOfAssignmentsForEachStudent) {
        this.listOfAssignmentsForEachStudent = listOfAssignmentsForEachStudent;
    }

    @Override
    public String toString() {
        return "AssignmentPerStudent{" + "id=" + id + ", student=" + student + ", listOfAssignmentsForEachStudent=" + listOfAssignmentsForEachStudent + '}';
    }

}
