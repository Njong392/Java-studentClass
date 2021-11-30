package com.company;
😪
public class Student {
    String name;
    Integer age;
    Double engScore;
    Double mathScore;
    Double average;
    Integer rank;

   /* Trying to create a method here to find the rank... but since I used an array of objects, I cannot
   directly influence the average of each object... Lost concerning other methods, because I can't find a
   suitable parameter for the method 😪
    */

    public static double[] rankFunction(double[] array){
        double temp;


        for(int i=0;i< array.length-1;i++){
            for(int j=0;j< array.length-2;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;

    }



    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("English score:"+this.engScore);
        System.out.println("Math score:"+this.mathScore);
        System.out.println("Average:"+this.average);
        System.out.println("Rank:"+this.rank);
    }


    public Student(String name, Integer age, Double engScore, Double mathScore){
        this.name = name;
        this.age = age;
        this.engScore = engScore;
        this.mathScore = mathScore;
        average = ((this.engScore)+(this.mathScore))/2;


    }
}
