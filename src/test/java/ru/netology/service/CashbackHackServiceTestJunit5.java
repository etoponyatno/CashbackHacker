package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJunit5 {

    @Test
    public void amountLess2000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(1900);
        long expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void amountEquals2000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(2000);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void amountOver2000() {
        CashbackHackService service = new CashbackHackService();
        long actual = service.remain(2101);
        long expected = 899;
        assertEquals(expected, actual);
    }
}