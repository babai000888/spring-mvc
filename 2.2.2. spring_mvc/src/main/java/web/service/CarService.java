package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public List<Car> getNcars (List<Car> carList, int n) {
        return carList.subList(0,n);
    }
}
