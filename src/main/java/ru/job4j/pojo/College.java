package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Albert Ivanov");
        student.setGroup("BioFac_2021");
        student.setReceiptDate(new Date());

        System.out.println("Student full name: " + student.getFio() + System.lineSeparator()
                + "Group name: " + student.getGroup() + System.lineSeparator()
                + "ReceiptDate: " + student.getReceiptDate());

    }
}
