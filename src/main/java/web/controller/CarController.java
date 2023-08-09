package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String allcar(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        if (count < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        model.addAttribute("allcars", carService.getCarLimit(count));
        return "car";
    }


}
