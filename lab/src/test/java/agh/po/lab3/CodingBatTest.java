package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();
    @org.junit.Test
    public void icyHot() {
    assertEquals(true, codingBat.icyHot(-11,101));
    assertEquals(false, codingBat.icyHot(1,100));
    assertEquals(true, codingBat.icyHot(-1,105));
    }

    @org.junit.Test
    public void monkeyTrouble() {
    assertEquals(true, codingBat.monkeyTrouble(true,true));
    assertEquals(false, codingBat.monkeyTrouble(false,true));
    assertEquals(true, codingBat.monkeyTrouble(false,false));
    }

    @org.junit.Test
    public void front22() {
    assertEquals("ababcdab",codingBat.front22("abcd") );
    assertEquals("tetestte",codingBat.front22("test"));
    assertEquals("aaa",codingBat.front22("a"));
    }
    @org.junit.Test
    public void mapAB3() {
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("a", "aaa");
        mapa1.put("c", "cake");

        assertEquals("aaa", codingBat.mapAB3(mapa1).get("b"));

        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("b", "bbb");
        mapa2.put("c", "cake");

        assertEquals("bbb", codingBat.mapAB3(mapa2).get("a"));

        Map<String, String> mapa3 = new HashMap<>();
        mapa3.put("a", "aaa");
        mapa3.put("b", "bbb");
        mapa3.put("c", "cake");

        assertEquals("aaa", codingBat.mapAB3(mapa3).get("a"));
        assertEquals("bbb", mapa3.get("b"));
    }
    @org.junit.Test
    public void wordMultiple() {
        String[] tablica1 = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> wynik1 = codingBat.wordMultiple(tablica1);
        assertEquals(Boolean.TRUE, wynik1.get("a"));
        assertEquals(Boolean.TRUE, wynik1.get("b"));
        assertEquals(Boolean.FALSE, wynik1.get("c"));
        assertEquals(3, wynik1.size());
    }
}