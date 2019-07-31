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
public class UtopianTree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] n = new int[t];
        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            int h=1;
            for (int j = 1; j <= n[i]; j++) {
                if (j % 2 == 0) {
                    h ++;
                } else {
                    h *= 2;
                }
            }
            System.out.println(h);
        }
    }
}
