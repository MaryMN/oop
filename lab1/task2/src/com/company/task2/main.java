package com.company.task2;


public class main {

    public static void main(String[] args) {
        System.out.println("Average media for all students from all universities is: " + String.format("%.02f", calculateAverage(populateWithDemoData())));

    }

    private static university[] populateWithDemoData() { student utmStudent1 = new student("AA AA", 20, 10.00f);
        student utmStudent2 = new student("AAA AAAA", 21, 10.00f);
        student utmStudent3 = new student("AAAA AAAA", 20, 9.5f);

        student[] utmStudents = {utmStudent1, utmStudent2, utmStudent3};

        student usmStudent1 = new student("BB BB", 20, 5.00f);
        student usmStudent2 = new student("BBB BBB", 19, 6.00f);
        student usmStudent3 = new student("BBBB BBBB", 30, 9.7f);

        student[] usmStudents = {usmStudent1, usmStudent2, usmStudent3};

        student asemStudent1 = new student("CC CC", 20, 7.00f);
        student asemStudent2 = new student("CCC CCC", 20, 5.00f);
        student asemtudent3 = new student("CCCC CCCC", 20, 8.00f);

        student[] asemStudents = {asemStudent1, asemStudent2, asemtudent3};

        university utm = new university(1964, "UTM", utmStudents);
        university usm = new university(1946, "USM", usmStudents);
        university asem = new university(1991, "ASEM", asemStudents);

        university[] universities = new university[3];
        universities[0] = utm;
        universities[1] = usm;
        universities[2] = asem;
        return universities;
    }

    private static float calculateAverage(university[] universities) {
        float studentsMarkSum = 0;
        int numberOfStudents = 0;
        for (university university : universities) {
            student[] students = university.getStudents();
            for (student student : students) {
                studentsMarkSum = student.getMark() + studentsMarkSum;
            }
            numberOfStudents = university.getStudents().length + numberOfStudents;
        }
        return studentsMarkSum / numberOfStudents;
    }
}
