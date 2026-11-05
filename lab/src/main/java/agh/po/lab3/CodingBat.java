package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat sprawdzenie = new CodingBat();
        sprawdzenie.icyHot(0,150);
        sprawdzenie.monkeyTrouble(true,false);
        sprawdzenie.front22("aaa");

    }
    public boolean icyHot(int temp1, int temp2) {
        if (temp1<0 && temp2 > 100 || temp2<0 && temp1 > 100 ){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true || aSmile == false && bSmile == false){
            return true;
        }
        else{
            return false;
        }
    }
    public String front22(String str) {
        if (str.length() >= 2){
            String a = str.substring(0,2);
            return a + str + a;
        }
        else if (str.length() == 1){
            String b = str.substring(0,1);
            return b + str + b;
        }
        else {
            return "";
        }

    }
    public Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey("a") && !map.containsKey("b")) {
            String wartosc = map.get("a");
            map.put("b", wartosc);
        }
        else if (map.containsKey("b") && !map.containsKey("a")) {
            String wartosc = map.get("b");
            map.put("a", wartosc);
        }
        return map;
    }
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        for (String i : strings) {
            if (map.containsKey(i)) {
                map.put(i, true);
            } else {
                map.put(i, false);
            }
        }

        return map;
    }



}
