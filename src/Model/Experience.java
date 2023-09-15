package Model;

import Common.Library;

public class Experience extends Candidate {
    private int ExplnYear;
    private String ProSkill;

    public Experience() {

    }

    public Experience(int candidateId, String firstName, String lastName, int birthDay, String address, String phone,
            String email, int explnYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email, proSkill);
        ExplnYear = explnYear;
        ProSkill = proSkill;
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int explnYear) {
        ExplnYear = explnYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public void input() {
        super.input();
        setCandidateType("Experience");
        setExplnYear(Library.getInt("Enter experience year", 0, 100));
        setProSkill(Library.validString("Enter pro skill"));
    }

}
