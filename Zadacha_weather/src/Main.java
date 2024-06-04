import java.util.*;

public class Main {
    private static Map<City, List<Weather>> weatherCity = new HashMap<>();

    public void addWeatherCity(City city, Weather weather) {
        if (weatherCity.containsKey(city)) {
            List<Weather> list = weatherCity.get(city);
            list.add(weather);
            weatherCity.put(city, list);
        } else {
            List<Weather> list = new ArrayList<>();
            list.add(weather);
            weatherCity.put(city, list);
        }
    }

    public void removeWeatherCity(City city, Weather weather) {
        weatherCity.remove(city);
    }

    public void updateWeatherCity(City city, Weather weather) {
        if (weatherCity.containsKey(city)) {
            List<Weather> list = weatherCity.get(city);
            list.remove(0);
            list.add(weather);
            weatherCity.put(city, list);
        } else {
            List<Weather> list = new ArrayList<>();
            list.add(weather);
            weatherCity.put(city, list);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        City city1 = new City("San Francisco");
        City city2 = new City("New York");
        City city3 = new City("Paris");

        Weather weather1 = new Weather("+15C", WeatherType.CLOUDY);
        Weather weather2 = new Weather("+20C", WeatherType.SUNNY);
        Weather weather3 = new Weather("+5C", WeatherType.RAINY);

        main.addWeatherCity(city1, weather1);
        main.addWeatherCity(city2, weather2);
        main.addWeatherCity(city3, weather1);
        main.removeWeatherCity(city1, weather1);
        main.updateWeatherCity(city2, weather3);
        weatherCity.forEach((key, value) -> System.out.println(key.getName() + " " + value.toString()));
    }
}
