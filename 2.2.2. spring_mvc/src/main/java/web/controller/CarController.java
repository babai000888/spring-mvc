package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "100") int count) {
        model.addAttribute("cars",new CarService().getNcars(CarService.getCars(),count));
        return "cars";
    }
}