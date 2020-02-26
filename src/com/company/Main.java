package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Волошин", "Кирилл", "Сергеевич", (byte) 4, 1);
        Student sdiploma = new StudentDiploma(
                "Волошин",
                "Кирилл",
                "Сергеевич",
                (byte) 4,
                1,
                "Java - лучший ООП язык!"
        );
        student.show();
        System.out.println("__________________________________");
        sdiploma.show();
    }
}
