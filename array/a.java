package array;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int[] marks=new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Physics marks is :-    " + marks[0]);
        System.out.println("Chemistry marks is :-  " + marks[1]);
        System.out.println("Math marks is :-       " + marks[2]);

    }
    
}
