package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class calcCountTest {

    @ParameterizedTest
//    @CsvSource({
////            "3,10000,3000,20000",
////            "2,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/count.csv")
    void testCalcIncomeLess(int expected, int income, int expenses, int threshold) {
        calcCount service = new calcCount();

//        int expected = 3;
//        int income = 10000;
//        int expenses = 3000;
//        int threshold = 20000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void testCalcIncomeMore() {
//        calcCount service = new calcCount();
//
//        int expected = 2;
//        int income = 100000;
//        int expenses = 60000;
//        int threshold = 150000;
//        int actual = service.calculate(income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
}
//}


