package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarServicelmpl;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServicelmpl carServicelmpl;

    @Autowired
    public CarsController(CarServicelmpl carServicelmpl) {
        this.carServicelmpl = carServicelmpl;
    }

    @GetMapping()
    public String carsNumber(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("listCars", carServicelmpl.numberCars(count));
        return "cars";
    }


}
