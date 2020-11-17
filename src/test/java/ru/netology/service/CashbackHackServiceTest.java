package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

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
}