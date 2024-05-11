package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFio("Testov Test Testovich");
        student1.setGroup("KSK-16-12");
        student1.setAdmisDate();

        System.out.println("Student " + student1.getFio() + " were admitted to group: " + student1.getGroup()
                           + " " + student1.getAdmisDate());
    }
}
