package models;

public class Trainer {

    private int idT;
    private String firstName;
    private String lastName;
    private String subject;

    public Trainer(int idT, String firstName, String lastName, String subject) {
        this.idT = idT;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "idT=" + idT + ", firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}';
    }

}
