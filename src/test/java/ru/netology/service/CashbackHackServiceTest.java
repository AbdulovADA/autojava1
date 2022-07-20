package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain900() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }
}
