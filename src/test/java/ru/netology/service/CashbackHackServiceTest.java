package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void amountLess1000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(900);
        long expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void amountEquals1000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(1000);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void amountOver1000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(1101);
        long expected = 899;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountLess2000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(1900);
        long expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountEquals2000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(2000);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountOver2000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(2101);
        long expected = 899;
        assertEquals(expected, actual);
    }
}