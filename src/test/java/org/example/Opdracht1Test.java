package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Opdracht1Test {

    @Test
    public void arrayWithGradesTest() {
        int[] grades = {80, 100, 20, 10, 40};

        System.out.println(printArrayInOriginalOrderTest(grades));
        System.out.println(sortArrayAndReturnLowestNumberShouldReturn10(grades));
        System.out.println(sortArrayAndReturnHighestNumberShouldReturn100(grades));
        System.out.println(returnAverageValueOfArrayShouldReturn(grades));
        printInvalidGrades(checkArrayValuesToBeBetween10And100(grades));

    }

    public String printArrayInOriginalOrderTest(int[] grades) {
        return Arrays.toString(grades);
    }

    public int sortArrayAndReturnLowestNumberShouldReturn10(int[] grades) {
        Arrays.sort(grades);
        return grades[0];
    }

    public int sortArrayAndReturnHighestNumberShouldReturn100(int[] grades) {
        Arrays.sort(grades);
        return grades[grades.length - 1];
    }

    public String returnAverageValueOfArrayShouldReturn(int[] grades) {
        return Arrays.stream(grades).average().toString();
    }

    public ArrayList<String> checkArrayValuesToBeBetween10And100(int[] grades) {
//        changed values so that we have something to test
        grades[2] = 101;
        grades[4] = -4;

        ArrayList<String> invalidGrades = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (grades[i] < 0 || grades[i] > 100) {
                invalidGrades.add("Value: \"" + grades[i] + "\" with index number " + i + " is not a valid grade");
            }
        }
        return invalidGrades;
    }

    public void printInvalidGrades(ArrayList<String> invalidGrades) {
        for (String invalidGrade : invalidGrades) {
            System.out.println(invalidGrade);
        }
    }
}