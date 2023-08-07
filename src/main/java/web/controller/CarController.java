package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String allcar(@RequestParam(name = "count",defaultValue = "5") int id, ModelMap model) {
        model.addAttribute("allcars",carService.getCarLimit(id));
        return "car";
    }


}
