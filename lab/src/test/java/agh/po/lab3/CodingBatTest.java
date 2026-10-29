package agh.po.lab3;

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
}