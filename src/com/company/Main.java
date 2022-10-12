package com.company;

public class Main {

    public static void main(String[] args) {
        homework2();
    }

    static void homework1() {
        boolean found = false;
        int[] a = {-2, 9, 11, 12, 14, 15, 22, 142};
        int key = 15;
        int hi = a.length - 1;
        int lo = 0;
        while (!found && lo <= hi) {
            int mid = (lo + hi) / 2;
            int val = a[mid];
            if (val == key)
                found = true;
            else if (val > key)
                hi = mid - 1;
            else
                lo = mid + 1;
            System.out.print(mid + " ");
        }
        System.out.println();
        System.out.println(found);

    }

    static void homework2() {
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        String key = "Charlie";
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(key)){
                System.out.println(grades[i]);
            }
        }
    }

}
