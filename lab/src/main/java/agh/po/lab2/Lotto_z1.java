package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto_z1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random rand = new Random();

        while (lista.size() < 6) {
            int n = rand.nextInt(49) + 1;

            if (!lista.contains(n)) {
                lista.add(n);
            }
        }

        System.out.println(lista);






    }
}







