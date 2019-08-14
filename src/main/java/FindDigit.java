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
public class FindDigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(), count = 0;
        s.nextLine();
        String[] sline = new String[t];
        int[] iline = new int[t];
        for (int i = 0; i < sline.length; i++) {
            sline[i] = s.nextLine();
            iline[i] = Integer.parseInt(sline[i]);
        }

        for (int i = 0; i < sline.length; i++) {
            int[] n = new int[sline.length];
            for (int j = 0; j < sline.length; j++) {
                n[j] = Integer.parseInt(sline[i].charAt(j) + "");
                try {
                    if (iline[i] % n[j] == 0) {
                        count++;
                    }
                } catch (Exception e) {

                }
            }
            System.out.println(count);
        }

    }
}
