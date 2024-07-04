package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> cars = carService.findAll(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
