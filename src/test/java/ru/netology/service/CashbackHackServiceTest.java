package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test

    public void testAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @org.junit.Test

    public void testAmountIsMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testAmountIsLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
    @org.junit.Test

    public void testAmountIsMultipleOf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
}
