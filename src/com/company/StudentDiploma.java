package com.company;

public class StudentDiploma extends Student {
    private String theme;
    public void setTheme(String theme){
        this.theme = theme;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Тема: " + this.theme);
    }

    public StudentDiploma(String last_name, String first_name, String surname, byte course, int id, String theme){
        super(last_name, first_name, surname, course, id);
        this.theme = theme;
    }
}
