package ru.netology.unitTEST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void ShouldReturnCashbackIfAmountIs900() {

       CashbackHackService cashbackHackService =  new CashbackHackService();

       int amount = 900;

       int actual = cashbackHackService.remain(amount);
       int expected = 100;

       assertEquals(expected, actual);
    }

    @Test
    void ShouldReturnCashbackIfAmountIs1000() {

        CashbackHackService cashbackHackService =  new CashbackHackService();

        int amount = 1000;

        int actualResult = cashbackHackService.remain(amount);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}