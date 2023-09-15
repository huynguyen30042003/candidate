package Common;

import java.util.ArrayList;

import Model.Experience;
import Model.Fresher;
import Model.Intern;

public class Algorithm {
    public static void search() {
        System.out.println("search");
    }

    public static void showAllCandidate(ArrayList<Experience> arrExperiences, ArrayList<Fresher> arrFreshers,
            ArrayList<Intern> arrInterns) {
        System.out.println("==========Experience==========");
        for (Experience ex : arrExperiences) {
            System.err.println(ex.getFirstName());
        }
        System.out.println("==========Fresher==========");

        for (Fresher fr : arrFreshers) {
            System.err.println(fr.getFirstName());
        }
        System.out.println("==========Intern==========");

        for (Intern in : arrInterns) {
            System.err.println(in.getFirstName());
        }
    }
}
