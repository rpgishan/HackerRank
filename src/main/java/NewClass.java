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
public class NewClass {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n=0,k=0,q=0;
        n = scan.nextInt();
        k = scan.nextInt();
        q = scan.nextInt();
        
        int[] elements = new int[n];
        int[] query =  new int[q];
        
        for(int i=0; i<n; i++){
            
            elements[i]= scan.nextInt();

        }
        
        for(int i=0; i<q; i++){
            query[i] = scan.nextInt();
        }
        int[] reElement = rotationFunction(elements,k);
        
        for (int i = 0; i < reElement.length; i++) {
            System.out.println(reElement[query[i]]); 
        }
    }
    
    public static int[] rotationFunction(int[] elements, int k){
        int count=0,index=0;
       int x=elements[0],y=0;
        
        while(count < elements.length){
            index = index+k;
            y = elements[(index)%elements.length];
            elements[(index)%elements.length] = x;
            x = y;
            
            count++;
        }
        return elements;
    }
}
