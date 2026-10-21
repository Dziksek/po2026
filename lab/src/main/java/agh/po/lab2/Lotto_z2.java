package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto_z2 {
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


        ArrayList<Integer> typy= new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            int a = Integer.parseInt(args[i]);
            typy.add(a);
        }
        System.out.println("Twoje typy: " + typy);
        int trafienia = 0;

        for (int i = 0; i < 6; i++) {
            int a = typy.get(i);

            if (lista.contains(a)) {
                trafienia = trafienia + 1;
            }
        }
        System.out.println(trafienia);


    }
}
