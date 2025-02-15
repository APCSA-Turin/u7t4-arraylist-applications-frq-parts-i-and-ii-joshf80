package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                Student s1 = list.get(j);
                Student s2 = list.get(j + 1);
                if (s1.getLastName().compareTo(s2.getLastName()) > 0) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
                if (s1.getLastName().compareTo(s2.getLastName()) == 0 && s1.getFirstName().compareTo(s2.getFirstName()) > 0) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
                if (s1.getLastName().compareTo(s2.getLastName()) == 0 && s1.getFirstName().compareTo(s2.getFirstName()) == 0 && s1.getGpa() < s2.getGpa()) { 
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }


            }

        }

        return list;
    }

}
