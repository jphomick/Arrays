import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            scores.add(r.nextInt(101));
        }

        System.out.println(scores);

        for (Integer i : scores) {
            String grade = getGrade(i);
            System.out.println(String.format("The grade for %d is a %s", i, grade));
        }

        System.out.println();
        Collections.shuffle(scores);

        Iterator<Integer> it = scores.iterator();
        while (it.hasNext()) {
            int i = it.next();
            String grade = getGrade(i);
            System.out.println(String.format("The grade for %d is a %s", i, grade));
        }

        System.out.println();
        int[] scores2 = new int[12];
        for (int i = 0; i < scores2.length; i++) {
            scores2[i] = r.nextInt(101);
        }

        System.out.println(scores2);
        for (int i : scores2) {
            String grade = getGrade(i);
            System.out.println(String.format("The grade for %d is a %s", i, grade));
        }
    }

    public static String getGrade(int score) {
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
