package Model;

import Common.Library;

public class Intern extends Candidate {
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {

    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int candidateId, String firstName, String lastName, int birthDay, String address, String phone,
            String email, String majors, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void input() {
        super.input();
        setMajors(Library.validString("Enter major"));
        setSemester(Library.getInt("Enter semester ", 0, 10));
        setUniversityName(Library.validString("Enter university"));

    }
}
