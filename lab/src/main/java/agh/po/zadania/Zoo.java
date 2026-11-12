package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();
        for(int i = 0; i < animals.length; i++){
            int wybor = random.nextInt(3);
            if (wybor ==0) {
                animals[i] = new Dog("Pies");
            } else if ( wybor == 1) {
                animals[i] = new Parrot("Papuga");
            } else {
                animals[i] = new Snake("Waz");
            }

        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getDescription());
        }
    }



}
