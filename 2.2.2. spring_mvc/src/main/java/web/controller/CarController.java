package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.MainApp;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam("count") int count) {
        List<Car> carList = MainApp.getCars();
        if(carList.size() < count) { count = carList.size(); }
        List<Car> cars = new CarService().getNcars(carList,count);
        model.addAttribute("cars",cars);
        return "cars";
    }

}