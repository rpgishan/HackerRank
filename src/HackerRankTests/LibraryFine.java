/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankTests;

import java.util.Scanner;

/**
 *
 * @author Gishan-mac
 */
public class LibraryFine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fine = 0;
        int[][] date = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                date[i][j] = s.nextInt();
            }
        }
        if (date[0][2] == date[1][2]) {
            if (date[0][1] == date[1][1]) {
                fine = (date[0][0] > date[1][0]) ? 15 * (date[0][0] - date[1][0]) : 0;
            } else if (date[0][1] > date[1][1]) {
                fine = 500 * (date[0][1] - date[1][1]);
            }
        } else if (date[0][2] > date[1][2]) {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
