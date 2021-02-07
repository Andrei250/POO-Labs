package com.pachetepachete;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Catalog extends TreeSet<Catalog.Student> {
    public Catalog() {

    }

    public Catalog(Comparator<Student> comparator) {
        super(comparator);
    }

    public void addStudent(String name, double media, int clazz) {
        this.add(new Student(name, media, clazz));
    }

    public Student getStudent(String name) {
        for (Student st : this) {
            if (st.name.equals(name)) {
                return st;
            }
        }

        return null;
    }

    public void removeStudent(String name) {
        this.removeIf(st -> st.name.equals(name));
    }

    public Catalog byClass(int clazz) {

        Catalog cat = new Catalog(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (Student st : this) {
            if (st.clazz == clazz) {
                cat.addStudent(st.name, st.media, st.clazz);
            }
        }

        return cat;

    }

    static class Student implements Comparable<Catalog.Student> {
        String name;
        double media;
        int clazz;

        public Student() {

        }

        public Student(String name, double media, int clazz) {
            this.name = name;
            this.media = media;
            this.clazz = clazz;
        }

        @Override
        public int compareTo(Catalog.Student o) {
            if (Double.compare(o.media, this.media) == 0) {
                return this.name.compareTo(o.name);
            }

            return Double.compare(this.media, o.media);
        }

        @Override
        public String toString() {
            return "Name : " + this.name + " Medie: " + this.media + " clazz: " + this.clazz + '\n';
        }
    }
}
