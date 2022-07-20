import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        long[] income = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();
        System.out.println();
        System.out.println("Сумма продаж за отчетный период = " + service.fetchTotal(income));

        System.out.println();
        System.out.println("Средння сумма продаж в месяц за отчетный период = " + service.fetchAverage(income));

        System.out.println();
        System.out.println("Пик(и) продаж - " + service.maxSales(income) + " месяц(ы)");

        System.out.println();
        System.out.println("Падение(я) продаж - " + service.minSales(income) + " месяц(ы)");

        System.out.println();
        System.out.println(service.fetchBelowAverageMonths(income) + " месяцев продаж ниже среднего показателя");

        System.out.println();
        System.out.println(service.fetchAboveAverageMonths(income) + " месяцев продаж выше среднего показателя");
    }
}

