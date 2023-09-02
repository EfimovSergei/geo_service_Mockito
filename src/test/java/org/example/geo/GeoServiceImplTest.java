package org.example.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.entity.Country;
import org.example.entity.Location;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeoServiceImplTest {

    @Test
    void TestLocalHost() {
        GeoService geoService = new GeoServiceImpl();
        Location result = geoService.byIp("127.0.0.1");

        assertEquals(null, result.getCity());
        assertEquals(null, result.getCountry());
       assertEquals(null, result.getStreet());
        assertEquals(0, result.getBuiling());

    }

    @Test
    void TestMOSCOW_IPTest() {
        GeoService geoService = new GeoServiceImpl();
        Location result = geoService.byIp("172.0.32.11");

        Assertions.assertEquals("Moscow", result.getCity());
        Assertions.assertEquals(Country.RUSSIA, result.getCountry());
        Assertions.assertEquals("Lenina", result.getStreet());
        Assertions.assertEquals(15, result.getBuiling());

    }

    @Test
    void NEW_YORK_IPTest() {
        GeoService geoService = new GeoServiceImpl();
        Location result = geoService.byIp("96.44.183.149");

        assertEquals("New York", result.getCity());
        assertEquals(Country.USA, result.getCountry());
        assertEquals(" 10th Avenue", result.getStreet());
        assertEquals(32, result.getBuiling());

    }
}