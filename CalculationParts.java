package nsu_cgpa;

import java.util.Objects;

public class CalculationParts {

    double[] courseCredits = new double[5];
    double[] courseGrades = new double[5];

    double result = 0;
    String grade;

    CalculationParts(String[] grades, String[] credit) {
        for (int count = 0; count < 5; count++) {
            courseCredits[count] = Double.parseDouble(credit[count]);
        }
        for (int count2 = 0; count2 < 5; count2++) {
            grade = grades[count2];

            if (Objects.equals(grades[count2], "A")) {
                courseGrades[count2] = 4.0;
            } else if (Objects.equals(grades[count2], "A-")) {
                courseGrades[count2] = 3.7;
            } else if (Objects.equals(grades[count2], "B+")) {
                courseGrades[count2] = 3.3;
            } else if (Objects.equals(grades[count2], "B")) {
                courseGrades[count2] = 3.0;
            } else if (Objects.equals(grades[count2], "B-")) {
                courseGrades[count2] = 2.7;
            } else if (Objects.equals(grades[count2], "C+")) {
                courseGrades[count2] = 2.3;
            } else if (Objects.equals(grades[count2], "C")) {
                courseGrades[count2] = 2.0;
            } else if (Objects.equals(grades[count2], "C-")) {
                courseGrades[count2] = 1.7;
            } else if (Objects.equals(grades[count2], "D+")) {
                courseGrades[count2] = 1.3;
            } else if (Objects.equals(grades[count2], "D")) {
                courseGrades[count2] = 1.0;
            }
        }
    }

    double totalCredits = 0;
    double sum = 0;

    double cgpa() {
        for (int count3 = 0; count3 < courseCredits.length; count3++) {
            totalCredits += courseCredits[count3];
        }

        for (int count4 = 0; count4 < courseCredits.length; count4++) {
            sum += courseCredits[count4] * courseGrades[count4];
        }

        result = sum / totalCredits;

        return result;
    }

}
