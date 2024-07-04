package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> findAll(Integer count) {

        List<Car> cars = new ArrayList<>();

            cars.add(new Car("Nissan", "Black", 32000));
            cars.add(new Car("Ferrari", "Red", 3223000));
            cars.add(new Car("Volvo", "Yellow", 150000));
            cars.add(new Car("Audi", "Blue", 59000));
            cars.add(new Car("Lada", "Black", 5000));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
