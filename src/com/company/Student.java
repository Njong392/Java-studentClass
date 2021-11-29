package com.company;

public class Student {
    String name;
    Integer age;
    Double engScore;
    Double mathScore;
    Double average;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEngScore(Double engScore) {
        this.engScore = engScore;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("English score:"+this.engScore);
        System.out.println("Math score:"+this.mathScore);
        System.out.println("Average:"+this.average);
    }


    public Student(String name, Integer age, Double engScore, Double mathScore){
        this.name = name;
        this.age = age;
        this.engScore = engScore;
        this.mathScore = mathScore;



        average = ((this.engScore)+(this.mathScore))/2;

    }
}
