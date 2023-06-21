package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSaleSumAllMouth(){
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.saleSumAllMonth(sale);
        int expected = 8 + 15 + 13 + 15 + 17+ 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testAverageS(){
        StatsService service = new StatsService();
        int[] averages = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageS(averages);
        int expected = (8 + 15 + 13 + 15 + 17+ 20 + 19 + 20 + 7 + 14 + 14 + 18) / averages.length;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMaxSaleInTheMouth(){
        StatsService service = new StatsService();
        int[] maxSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSale(maxSale);
        int expected = 7;
    }
    @Test
    public void testMinSaleInTheMouth(){
        StatsService service = new StatsService();
        int[] minSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSale(minSale);
        int expected = 8;
    }
    @Test
    public void testMinSaleAverageQuantity(){
        StatsService service= new StatsService();
        int[] minSaleAver = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSaleAverageQuantity(minSaleAver);
        int expected = 5;
    }
    @Test
    public void testMaxSaleAverageQuantity(){
        StatsService service= new StatsService();
        int[] maxSaleAver = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSaleAverageQuantity(maxSaleAver);
        int expected = 5;
    }
}
