package Controller;

import java.util.ArrayList;

import Common.Algorithm;
import Common.Library;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import Views.Menu;

public class CandidateProgramming extends Menu<String> {
    static String[] option = { "Create Experience Candidate", "Create Fresher Candidate", "Create Intern Candidate",
            "Search candidate", "Exit" };
    Experience experience = new Experience();
    Fresher fresher = new Fresher();
    Intern intern = new Intern();
    ArrayList<Experience> ExperienceArray = new ArrayList<Experience>();
    ArrayList<Fresher> FresherArray = new ArrayList<Fresher>();
    ArrayList<Intern> InternArray = new ArrayList<Intern>();

    protected Library library;
    protected Algorithm algorithm;

    public CandidateProgramming(Experience experience, Fresher fresher, Intern intern) {
        super("All option", option);

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println(option[n]);
                Experience experience = new Experience();
                experience.input();
                ExperienceArray.add(experience);
                break;
            case 2:
                System.out.println(option[n]);
                Fresher fresher = new Fresher();
                fresher.input();
                FresherArray.add(fresher);
                break;
            case 3:
                System.out.println(option[n]);
                Intern intern = new Intern();
                intern.input();
                InternArray.add(intern);
                break;
            case 4:
                System.out.println(option[n]);
                Algorithm.showAllCandidate(ExperienceArray, FresherArray, InternArray);
                String target = Library.validString("Enter value search");

                int typeOfcandidate = Library.getInt("Enter type of candidare", 0, 2);
                switch (typeOfcandidate) {
                    case 0:
                        Algorithm.searchExperience(ExperienceArray, target);
                        break;
                    case 1:
                        Algorithm.searchFresher(FresherArray, target);
                        break;
                    case 2:
                        Algorithm.searchArray(InternArray, target);
                        break;
                }
                break;
            case 5:
                System.out.println(option[n]);
                System.exit(0);
                break;
        }
    }
}
