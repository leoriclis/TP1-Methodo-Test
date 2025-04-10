package com.tp.meteo;

public class MeteoManager {
    private final WeatherService weatherService;

    public MeteoManager(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getWeatherReport(String city) {
        String current = weatherService.getCurrentWeather(city);
        return "Météo à " + city + " : " + current;
    }
}
