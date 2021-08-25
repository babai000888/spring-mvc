package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarService {

    private static volatile List<Car> cars;

    public static List<Car> getCars() {
        if(cars == null) {
            cars = Arrays.asList(
                    new Car("Lada", 2101, 1965),
                    new Car("Ford", 999, 1950),
                    new Car("Fiat", 123, 2001),
                    new Car("Audi", 100, 1985),
                    new Car("BMW", 3, 1990));
        }
        return cars;
    }

    public List<Car> getNcars (int n) {
        if(getCars().size() < n | n < 0 | n > 4) { n = getCars().size(); }
        return getCars().subList(0,n);
    }
}
