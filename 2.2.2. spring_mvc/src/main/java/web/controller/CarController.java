package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private final CarService service;

    public CarController (CarService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(value ="count", defaultValue = "0",required = false) Integer count) {
        model.addAttribute("cars",service.getNcars(count));
        return "cars";
    }
}