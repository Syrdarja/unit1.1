package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    //@org.testng.annotations.Test

    public void testAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test

    public void testAmountIsMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test

    public void testAmountIsLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test

    public void testAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
