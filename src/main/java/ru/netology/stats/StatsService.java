package ru.netology.stats;

//сумму всех продаж calculateSum
//среднюю сумму продаж в месяц calculateAverageAtMonth
// номер месяца, в котором был пик продаж* calculateNumMonthMaxSale
//номер месяца в котором был минимум продаж* calculateNumMonthMinSale
//количество месяцев, в которых продажи были ниже среднего calculateAmountMonthLowAverage
//количество месяцев, в которых продажи были выше среднего calculateAmountMonthHighAverage
// * в задании надо найти последний месяц, соответствующий условию

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale :
                sales) {
            sum = sum + sale;

        }
        return sum;

    }

    public int calculateAverageAtMonth(int[] sales) {
        int averageSum = calculateSum(sales) / sales.length;
        return averageSum;
    }

    public int calculateNumMonthMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale :
                sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int calculateNumMonthMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale :
                sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int calculateAmountMonthLowAverage(int[] sales) {
        int amount = 0;
        int averageSale = calculateAverageAtMonth(sales);
        for (int sale :
                sales) {
            if (sale < averageSale) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int calculateAmountMonthHighAverage(int[] sales) {
        int amount = 0;
        int averageSale = calculateAverageAtMonth(sales);
        for (int sale :
                sales) {
            if (sale > averageSale) {
                amount = amount + 1;
            }
        }
        return amount;
    }
}



