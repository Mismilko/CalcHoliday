package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.services.FreelanceService;

class FreelanceServiceTest {
    @Test
    public void testHoliday3months() {
        FreelanceService service = new FreelanceService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testHoliday2months() {
        FreelanceService service = new FreelanceService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);


    }
}
