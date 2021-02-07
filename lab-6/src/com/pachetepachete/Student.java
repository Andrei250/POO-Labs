package com.pachetepachete;

import java.util.Collections;
import java.util.Vector;

public class Student implements Persoana {
    private String name;
    private Vector<Double> medii;

    public Student() {
        this("Student", new Vector<Double>());
    }

    public Student(String name) {
        this(name, new Vector<Double>());
    }

    public Student(String name, Vector<Double> medii) {
        this.medii = medii;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Double> getMedii() {
        return medii;
    }

    public void setMedii(Vector<Double> medii) {
        this.medii = medii;
    }

    @Override
    public double calculMedieGenerala() {
        double sum = 0;

        for (Double val : this.medii) {
            sum = sum + val;
        }

        return sum / this.medii.size();
    }

    @Override
    public String getNume() {
        return this.getName();
    }

    @Override
    public void setNume(String nume) {
        this.setName(nume);
    }

    @Override
    public void addMedie(double medie) {
        this.medii.add(medie);
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;

        if (this.name.equals(student.name)) {
            if ((student.calculMedieGenerala() - this.calculMedieGenerala()) < 0) {
                return -1;
            }
            return 1;
        }

        return this.name.compareTo(student.name);

    }

    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        Student st1 = new Student("AB");
        Student st2 = new Student("AB");
        Student st3 = new Student("AC");

        st1.addMedie(5);
        st1.addMedie(6);
        st1.addMedie(7);
        st1.addMedie(8);
        st2.addMedie(10);
        st2.addMedie(1);
        st2.addMedie(2);
        st2.addMedie(3);
        st3.addMedie(8);
        st3.addMedie(8);
        st3.addMedie(8);
        st1.addMedie(8);

        students.add(st1);
        students.add(st2);
        students.add(st3);

        Collections.sort(students);

        for (Student st : students) {
            System.out.println(st.getName() + " " + st.calculMedieGenerala());
        }

    }
}
