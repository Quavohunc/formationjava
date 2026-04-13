package com.formation;
import java.util.Arrays;

public class TriBulles {
    public static void trierBulles(int [] tableau){
        for(int i = tableau.length-1; i >=1;i--){
            boolean echangeEffectue = false;
            for(int j = 0; j < i; j++){
                if(tableau[j] > tableau[j +1]){
                    int temp = tableau[j];
                    tableau[j] = tableau[j+1];
                    tableau[j+1] = temp;
                    echangeEffectue = true;
                }
            }
            if(!echangeEffectue) break;
        }
    }
    public static void main(String[] args){
        int[] tab = {64, 34, 25, 12, 22, 11, 90};
        trierBulles(tab);
        System.out.println(Arrays.toString(tab));
    }
}