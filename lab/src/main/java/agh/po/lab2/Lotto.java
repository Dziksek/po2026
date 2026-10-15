package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int n = rand.nextInt(50);
            if (lista.size() ==0) {
                lista.add(n);
            } else {
                for (int b = 0; b < i; b++) {
                    int c = lista.get(b);
                    if (n != c) {
                        lista.add(n);
                    }

                }
            }
            System.out.print(lista);
        }
    }




}







