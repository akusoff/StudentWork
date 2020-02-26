package com.company;

public class Student {
    private String last_name, first_name, surname;
    private byte course;
    private int id;
    public void setLastName(String last_name){
        this.last_name = last_name;
    }
    public void setFirstName(String first_name){
        this.first_name = first_name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setCourse(byte course){
        this.course = course;
    }
    public void setId(int id){
        this.id = id;
    }
    public void show(){
        System.out.println("Номер: " + this.id);
        System.out.println("Фамилия: " + this.last_name);
        System.out.println("Имя: " + this.first_name);
        System.out.println("Отчество: " + this.surname);
        System.out.println("Курс: " + this.course);
    }
    public Student(String last_name, String first_name, String surname, byte course, int id){
        this.last_name = last_name;
        this.first_name = first_name;
        this.surname = surname;
        this.course = course;
        this.id = id;
    }
}
