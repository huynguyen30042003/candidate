package Common;

import java.util.Scanner;

public class Library {
    public static int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public static String validString(String promt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(promt + ":");
        String Str = sc.nextLine();
        return Str;
    }

    public static String validPhone(String prompt) {
        Scanner sc = new Scanner(System.in);
        String phone;
        do {
            System.out.print(prompt);
            phone = sc.nextLine();
            if (!phone.matches("\\d{10,}")) {
                System.out.println("Invalid phone. Please enter a number with minimum 10 digits.");
            }
        } while (!phone.matches("\\d{10,}"));
        return phone;
    }

    public static String validEmail(String prompt) {
        Scanner sc = new Scanner(System.in);
        String email;
        System.out.print("Email: ");
        email = sc.nextLine();
        while (!email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b")) {
            System.out.print("Invalid email. Please enter a valid email address: ");
            email = sc.nextLine();
        }
        return email;
    }

    public static String validRank(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rank of Graduation (Excellence/Good/Fair/Poor): ");
        String rankOfGraduation = sc.nextLine();
        while (!rankOfGraduation.matches("Excellence|Good|Fair|Poor")) {
            System.out.print(
                    "Invalid rank of graduation. Please enter one of the following values: Excellence, Good, Fair, Poor: ");
            rankOfGraduation = sc.nextLine();
        }
        return rankOfGraduation;
    }
}
