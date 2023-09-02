package org.example.i18n;

import org.junit.jupiter.api.Test;
import org.example.entity.Country;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalizationServiceImplTest {


    @Test
    public void TestRussianText() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.RUSSIA);
        assertEquals("Добро пожаловать", result);
    }

    @Test
    public void TestUSAText() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.USA);
        assertEquals("Welcome", result);
    }
}