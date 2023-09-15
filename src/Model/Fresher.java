package Model;

import Common.Library;

public class Fresher extends Candidate {
    private String graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher() {

    }

    public Fresher(String graduation_date, String graduation_rank, String education) {
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public Fresher(int candidateId, String firstName, String lastName, int birthDay, String address, String phone,
            String email, String graduation_date, String graduation_rank, String education) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void input() {
        super.input();
        setGraduation_date(Library.validString("Enter valid graduation date"));
        setGraduation_rank(Library.validRank("Enter valid graduation rank"));
        setEducation(Library.validString("Enter valid education"));
    }
}
