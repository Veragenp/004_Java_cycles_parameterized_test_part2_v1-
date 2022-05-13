package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void soulsCalculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }

    @Test
    void soulsCalculateAverageAtMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageAtMonth(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumMonthMaxSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateNumMonthMaxSale(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumMonthMinSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateNumMonthMinSale(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAmountMonthLowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAmountMonthLowAverage(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAmountMonthHighAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAmountMonthHighAverage(sales);
        assertEquals(expected, actual);

    }
}