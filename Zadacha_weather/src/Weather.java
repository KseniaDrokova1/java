public class Weather {

    private String temperature;
    private WeatherType weather;

    public Weather (String city, WeatherType weather) {
        this.temperature = city;
        this.weather = weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public WeatherType getWeather() {
        return weather;
    }

    @Override
    public String toString(){
        return temperature + " " + weather;
    }
}
