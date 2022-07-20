package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void goFetchTotalAmount() {
        StatsService service = new StatsService();

        long[] income = {12, 41, 9, 22, 31, 17, 16, 1, 29, 2};

        long expected = 180;
        long actual = service.fetchTotal(income);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goFetchAverageAmount() {
        StatsService service = new StatsService();

        long[] income = {12, 41, 9, 22, 31, 17, 16, 1, 29, 2};

        double expected = 18.0;
        double actual = service.fetchAverage(income);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goFindSalesPeak() {
        StatsService service = new StatsService();

        long[] income = {12, 41, 9, 22, 31, 17, 16, 1, 29, 2};
        long expected = 1;
        long actual = service.maxSales(income);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goFindSalesGap() {
        StatsService service = new StatsService();

        long[] income = {12, 41, 9, 22, 31, 17, 16, 1, 29, 2};
        long expected = 7;
        long actual = service.minSales(income);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goFindBelowAverageMonths() {
        StatsService service = new StatsService();

        long[] income = {12, 41, 9, 22, 31, 17, 16, 1, 29, 2};
        long expected = 6;
        long actual = service.fetchBelowAverageMonths(income);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goFindAboveAverageMonths() {
        StatsService service = new StatsService();

        long[] income = {12, 41, 9, 22, 31, 17, 16, 1, 29, 2};
        long expected = 4;
        long actual = service.fetchAboveAverageMonths(income);

        Assertions.assertEquals(expected, actual);
    }
}
