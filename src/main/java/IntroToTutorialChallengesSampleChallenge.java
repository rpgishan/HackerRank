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
public class IntroToTutorialChallengesSampleChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt(),n=s.nextInt();
        int[] nos = new int[n];
        for (int i = 0; i < nos.length; i++) {
                nos[i] = s.nextInt();
        }
        for (int i = 0; i < nos.length; i++) {
            if(v==nos[i]){
                System.out.println(i);
            }
        }
    }
}
