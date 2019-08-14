/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankTests;

import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class CircularArrayRotation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n], m = new int[q];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int j = 0; j < q; j++) {
            m[j] = in.nextInt();
        }
        int[] out = new CircularArrayRotation().rotateArray(a, k);
//        for (int i = 0; i < out.length; i++) {
//            System.out.print(out[i] + " ");
//        }
//        System.out.println("");
        for (int i = 0; i < m.length; i++) {
            System.out.println(out[m[i]]);
        }
    }

    int[] rotateArray(int[] srcArray, int k) {
        int length = srcArray.length;
        int[] destArray = new int[length];
        k %= length;
        for (int i = 0; i < length; i++) {
            destArray[(k + i) % length] = srcArray[i];
        }

        return destArray;
    }
}
