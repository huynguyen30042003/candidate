package Common;

import java.util.ArrayList;
import Model.Experience;
import Model.Fresher;
import Model.Intern;

public class Algorithm {
    public static void searchExperience(ArrayList<Experience> arrExperiences,String target) {
        for (int i = 0; i < arrExperiences.size(); i++) {
            if (arrExperiences.get(i).getFirstName().equals(target)) {
                System.out.println(arrExperiences.get(i));
            }
        }
    }

    public static void searchFresher(ArrayList<Fresher> FresherArray,String target) {
        for (int i = 0; i < FresherArray.size(); i++) {
            if (FresherArray.get(i).getFirstName().equals(target)) {
                System.out.println(FresherArray.get(i));
            }
        }
    }

    public static void searchArray(ArrayList<Intern> InternArray,String target) {
        for (int i = 0; i < InternArray.size(); i++) {
            if (InternArray.get(i).getFirstName().equals(target)) {
                System.out.println(InternArray.get(i));
            }
        }
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

    public static boolean isContinue() {
        String isNext;
        do {
            isNext = Library.validString("Do you want to continue (Y/N)? ");
        } while (!isNext.equalsIgnoreCase("Y") && !isNext.equalsIgnoreCase("N"));
        return isNext.equalsIgnoreCase("Y");
    }
}
