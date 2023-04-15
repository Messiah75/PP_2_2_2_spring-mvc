package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static int COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++COUNT, "Nissan", 876));
        cars.add(new Car(++COUNT, "Toyota", 922));
        cars.add(new Car(++COUNT, "Lada", 374));
        cars.add(new Car(++COUNT, "Mazda", 11));
        cars.add(new Car(++COUNT, "BWM", 54));
    }

    @Override
    public List<Car> returnCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
