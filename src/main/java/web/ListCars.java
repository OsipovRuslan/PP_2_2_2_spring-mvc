package web;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListCars {
    List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("car1", 1, "red"));
        carList.add(new Car("car2", 2, "blue"));
        carList.add(new Car("car3", 3, "black"));
        carList.add(new Car("car4", 4, "white"));
        carList.add(new Car("car5", 5, "green"));
    }
    public Car getCar(int index) {
        return carList.get(index);
    }
    public List<Car> getListCars() {
        return carList;
    }
}
