package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30);
        weatherData.setMeasurements(90, 70, 40);
        weatherData.setMeasurements(100, 80, 50);
    }
}
