
import Controller.CandidateProgramming;
import Model.Experience;
import Model.Fresher;
import Model.Intern;

public class main {
    public static void main(String[] args) {
        Experience experience = new Experience();
        Fresher fresher = new Fresher();
        Intern intern = new Intern();
        new CandidateProgramming(experience, fresher, intern).run();
    }
}
