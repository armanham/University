package com.company;

import java.util.Scanner;

public class University {
    private String name;
    private int countOfStudents;
    private int maxCountOfStudents;
    private int maxAgeOfStudents;
    private int minAgeOfStudents;

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudents, int minAgeOfStudents) {
        setName(name);
        setCountOfStudents(countOfStudents);
        setMaxCountOfStudents(maxCountOfStudents);
        setMaxAgeOfStudents(maxAgeOfStudents);
        setMinAgeOfStudents(minAgeOfStudents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public int getMaxCountOfStudents() {
        return maxCountOfStudents;
    }

    public void setMaxCountOfStudents(int maxCountOfStudents) {
        if (maxCountOfStudents <= 1000) {
            this.maxCountOfStudents = maxCountOfStudents;
        }
    }

    public int getMaxAgeOfStudents() {
        return maxAgeOfStudents;
    }

    public void setMaxAgeOfStudents(int maxAgeOfStudents) {
        if (maxAgeOfStudents <= 28) {
            this.maxAgeOfStudents = maxAgeOfStudents;
        }
    }

    public int getMinAgeOfStudents() {
        return minAgeOfStudents;
    }

    public void setMinAgeOfStudents(int minAgeOfStudents) {
        if (minAgeOfStudents >= 16) {
            this.minAgeOfStudents = minAgeOfStudents;
        }
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", countOfStudents=" + countOfStudents +
                ", maxCountOfStudents=" + maxCountOfStudents +
                ", maxAgeOfStudents=" + maxAgeOfStudents +
                ", minAgeOfStudents=" + minAgeOfStudents +
                '}';
    }

    public void display() {
        System.out.println(toString());
        System.out.print("Input your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean check = checkAge(age);
        if (check == true) {
            System.out.println("We have 2 courses.");
            System.out.println("First course - Applied Mathematics /1/");
            System.out.println("Second Course - Computer Science /2/");
            System.out.print("Choose your course: ");
            int chooseCourse = scanner.nextInt();
            boolean checkCount = calculateFinalCountOfStudents(getCountOfStudents());
            if (checkCount == true) {
                admission(chooseCourse);
            }
        }
    }

    private boolean checkAge(int age) {
        boolean check = false;
        if (age >= getMinAgeOfStudents() && age <= getMaxAgeOfStudents()) {
            check = true;
        }
        return check;
    }

    private boolean calculateFinalCountOfStudents(int a) {
        int finalCount = getCountOfStudents() + 1;
        boolean check = false;
        if (finalCount <= getMaxCountOfStudents()) {
            check = true;
        }
        return check;
    }

    private void admission(int a) {
        if (a == 1 || a == 2) {
            System.out.println("Welcom to our University: ");
        }
    }
}
