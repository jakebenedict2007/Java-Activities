class Student {
    String name;
    int[] quizzes;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }

    double average() {
        int total = 0;
        for (int i = 0; i < quizzes.length; i++) {
            total += quizzes[i];
        }
        return (double) total / quizzes.length;
    }
}

public class ClassRankingSystem {
    public static void main(String[] args) {
        String[] names = {"Ana", "Ben", "Carlo", "Dina", "Ella"};
        int[][] data = {
            {85, 90, 78, 92},
            {88, 76, 95, 81},
            {70, 65, 80, 75},
            {90, 85, 88, 91},
            {88, 76, 95, 81}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], data[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average() < students[j + 1].average()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("LEADERBOARD");
        int rank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average() != students[i - 1].average()) {
                rank = i + 1;
            }
            System.out.printf("%d. %s - %.2f%n", rank, students[i].name, students[i].average());
        }

        String search = "Carlo";
        System.out.println(search + " is rank " + findRank(students, search));
    }

    static int findRank(Student[] students, String name) {
        int rank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average() != students[i - 1].average()) {
                rank = i + 1;
            }
            if (students[i].name.equals(name)) {
                return rank;
            }
        }
        return -1;
    }
}
