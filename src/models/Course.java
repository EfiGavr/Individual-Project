package models;

import java.time.LocalDate;

public class Course {

    private int idC;
    private String courseTitle;
    private String type;
    private String stream;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(int idC, String courseTitle, String type, String stream, LocalDate startDate, LocalDate endDate) {
        this.idC = idC;
        this.courseTitle = courseTitle;
        this.type = type;
        this.stream = stream;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" + "idC=" + idC + ", courseTitle=" + courseTitle + ", type=" + type + ", stream=" + stream + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

}
