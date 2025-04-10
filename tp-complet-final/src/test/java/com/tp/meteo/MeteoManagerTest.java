package com.tp.meteo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MeteoManagerTest {

    @Test
    void testGetWeatherReport() {
        WeatherService mockService = mock(WeatherService.class);
        when(mockService.getCurrentWeather("Paris")).thenReturn("Ensoleillé");

        MeteoManager manager = new MeteoManager(mockService);
        String result = manager.getWeatherReport("Paris");

        assertEquals("Météo à Paris : Ensoleillé", result);
        verify(mockService).getCurrentWeather("Paris");
    }
}
