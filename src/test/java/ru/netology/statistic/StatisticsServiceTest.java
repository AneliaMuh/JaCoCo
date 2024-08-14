package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMaxBeginning() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 41, 5, 3, 8, 6, 11, 11, 12};
        long expected = 41;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}
