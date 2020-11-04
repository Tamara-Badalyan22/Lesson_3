package service;

import Sorting.TestArray;
import model.Student;

public class Lesson3 {
    public static void main(String[] args) {
        //Task1 -> Bubble sort
        System.out.println("---Task_1---");
        int[] array = {5, 2, 4, 752, 14, 65, 1, 2, 57};
        TestArray tArray = new TestArray();
        tArray.PrintArray(array);
        tArray.BubbleSort(array);
        tArray.PrintArray(array);
        System.out.println("-----------------");

        //Task2 -> Custom Class
        System.out.println("---Task_2---");
        Student student = new Student();
        student.setFirstName("Marie");
        student.setLastName("John");
        student.setFee(500000);
        student.setGPA(78);
        System.out.println(student.getFirstName() + " " + student.getLastName());
        student.Discount();

    }
}
