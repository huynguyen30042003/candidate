package Model;

import Common.Library;

public class Candidate {
    private int candidateId;
    private String firstName, lastName;
    private int birthDay;
    private String address, phone, email;

    public Candidate() {

    }

    public Candidate(int candidateId, String firstName, String lastName, int birthDay, String address, String phone,
            String email) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
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

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input() {
        setCandidateId(Library.getInt("Enter valid candidate ID", 0, 1000));
        setFirstName(Library.validString("Enter valid first name"));
        setLastName(Library.validString("Enter valid last name"));
        setBirthDay(Library.getInt("Enter valid birth day", 1900, 2023));
        setAddress(Library.validString("Enter valid address"));
        setPhone(Library.validPhone("Enter valid phone"));
        setEmail(Library.validEmail("Enter valid email"));

    }

    @Override
    public String toString() {
        return "Candidate [candidateId=" + candidateId + ", firstName=" + firstName + ", lastName=" + lastName
                + ", birthDay=" + birthDay + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
    }
    
}
