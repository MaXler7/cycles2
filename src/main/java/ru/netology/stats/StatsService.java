package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; //
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; //
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;


    }

    public int testLessThanAvgMonths(int[] sales) {
        int monthsAmount = 0;
        for (int monthSale : sales) {
            if (monthSale < calculateAvg(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public int testMoreThanAvgMonths(int[] sales) {
        int monthsAmount = 0;
        for (int monthSale : sales) {
            if (monthSale > calculateAvg(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }
}





