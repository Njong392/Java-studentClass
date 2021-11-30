package com.company;

public class Main {

    public static void main(String[] args) {
        //creating an array of objects
        Student[] arr;

        arr = new Student[11]; //allocating memory for 10 students

        //instantiating array elements i.e student objects
        arr[0] = new Student("Tabi",18,10.4,15.0);
        arr[1] = new Student("Mote",17,15.5,28.0);
        arr[2] = new Student("Emy",18,25.5,29.0);
        arr[3] = new Student("Telmah",20,28.0,23.0);
        arr[4] = new Student("Mariette",18,30.5,30.0);
        arr[5] = new Student("Favour",15,19.0,23.0);
        arr[6] = new Student("Serge",19,17.0,18.5);
        arr[7] = new Student("Faithful",18,30.2,30.5);
        arr[8] = new Student("Vanibel", 19,19.1,17.0);
        arr[9] = new Student("Chelsea",19,21.0,17.0);
        arr[10] = new Student("Genesis",20,19.9,19.9);

        for (int i=0;i<= arr.length;i++){
            arr[i].display();

            System.out.println(" ");
        }


    }
}
