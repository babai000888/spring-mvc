package web;

import web.model.Car;
import web.service.CarService;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car("Lada", 2101, 1965),
                new Car("Ford", 999, 1950),
                new Car("Fiat", 123, 2001),
                new Car("Audi", 100, 1985),
                new Car("BMW", 3, 1990));

        for (Car car : new CarService().getNcars(carList,3)) {
            System.out.println( car.toString() );
        }


    }
}

