package ru.netology.service;

public class StatsService {

    public int saleSumAllMonth(int[] sale) {
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sale[i] + sum;
        }
        return sum;
    }

    public int averageS(int[] sale) {
        int averageSale = saleSumAllMonth(sale) / sale.length;
        return averageSale;
    }

    public int maxSale(int[] sale) {
        int numberSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[numberSale]) {
                numberSale = i;
            }
        }
        return numberSale;
    }

    public int minSale(int[] sale) {
        int numberSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[numberSale]) {
                numberSale = i;
            }
        }
        return numberSale;
    }
    public int minSaleAverageQuantity(int[] sale) {
        int averageSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < (saleSumAllMonth(sale) / sale.length)){
                averageSale++;
            }
        }

        return averageSale;
    }
    public int maxSaleAverageQuantity(int[] sale) {
        int averageSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > (saleSumAllMonth(sale) / sale.length)){
                averageSale++;
            }
        }

        return averageSale;
    }

}
