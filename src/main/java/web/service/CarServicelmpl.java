package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServicelmpl implements CarService {

    private List<Car> listCars;

    {
        listCars = new ArrayList<>();
        listCars.add(new Car("BMW", 20000, 211));
        listCars.add(new Car("Toyota", 30000, 213));
        listCars.add(new Car("Lada", 2500, 345));
        listCars.add(new Car("Niva", 3000, 123));
        listCars.add(new Car("Lexus", 40000, 456));
    }

    @Override
    public List<Car> numberCars(int count) {
       return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
