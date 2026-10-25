public class GradeThresholdChecker {
    public static void main(String[] args) {
        double average = 82.5;
        int absences = 5;

        boolean pass = (average >= 75 && absences <= 3) || average >= 90;

        if (pass) {
            System.out.println("PASS - average is " + average + " with " + absences + " absences");
        } else {
            System.out.println("FAIL - average is " + average + " but has " + absences + " absences (max is 3 unless average is 90+)");
        }
    }
}
