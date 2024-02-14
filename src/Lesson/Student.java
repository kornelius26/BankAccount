package Lesson;

public class Student {
    int studentId;
    String name;
    String surName;
    int year;
    double srMath;
    double srEconomy;
    double srLanguage;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Jon";
        st1.surName = "Yout";
        st1.year = 2005;
        st1.srMath = 7.7;
        st1.srEconomy = 8.9;
        st1.srLanguage = 9.0;

      
    }
}
