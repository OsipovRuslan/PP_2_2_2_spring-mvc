package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.ListCars;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService{
    @Autowired
    ListCars listCars;

    @Override
    public List<Car> getCars(Integer count) {
        if(count == null) return listCars.getListCars();
        return listCars.getListCars().stream().limit(count).toList();
    }
}
