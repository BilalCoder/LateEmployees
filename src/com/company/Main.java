package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] b =new String[a];
        int count = 0;
        for(int i=0; i<a; i++) {
            b[i] = sc.next();
            if(b[i].charAt(0) == '9'){
                if(b[i].charAt(2) >= '3' && b[i].charAt(3) > '0'){
                    count++;
                }
            }
            else if(b[i].charAt(0) > '9'){
                count++;
            }
        }

        if(count>0)
            System.out.println(count+" employees are late");
        else
            System.out.println("All employees are on time");
    }
}
