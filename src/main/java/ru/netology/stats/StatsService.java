package ru.netology.stats;

public class StatsService {

    public long fetchTotal(long[] income) {
        long total = 0;

        for (int i = 0; i < income.length; i++) {
            total = total + income[i];
        }
        return total;
    }

    public double fetchAverage(long[] income) {

        long total = 0;
        int month = income.length;

        for (int i = 0; i < income.length; i++) {
            total = total + income[i];
        }
        return total / month;
    }

    public int maxSales(long[] income) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : income) {
            if (sale >= income[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSales(long[] income) {
        int minMonth = 0;
        int month = 0;

        for (long sale : income) {
            if (sale <= income[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int fetchBelowAverageMonths(long[] income) {
        int worstMonth = 0;
        int count = 0;
        double average = fetchAverage(income);

        for (int i = 0; i < income.length; i++) {
            if (income[i] >= average) {
                continue;
            }
            if (income[i] < average) {
                worstMonth = i;
            }
            count++;
        }
        return count;
    }

    public int fetchAboveAverageMonths(long[] income) {
        int bestMonth = 0;
        int count = 0;
        double average = fetchAverage(income);

        for (int i = 0; i < income.length; i++) {
            if (income[i] <= average) {
                continue;
            }
            if (income[i] > average) {
                bestMonth = i;
            }
            count++;
        }
        return count;
    }
}