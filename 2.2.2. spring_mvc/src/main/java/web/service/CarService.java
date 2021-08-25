package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarService {

    public static List<Car> getCars() {
        return  Arrays.asList(
                new Car("Lada", 2101, 1965),
                new Car("Ford", 999, 1950),
                new Car("Fiat", 123, 2001),
                new Car("Audi", 100, 1985),
                new Car("BMW", 3, 1990));
    }

    public List<Car> getNcars (List<Car> carList, int n) {
        if(carList.size() < n | n < 0 | n > 4) { n = carList.size(); }
        return carList.subList(0,n);
    }
}
