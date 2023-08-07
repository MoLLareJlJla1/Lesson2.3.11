package web.Service;


import web.model.Car;

import java.util.List;

public interface  CarService {
 List<Car> getCarList();
 List<Car> getCarLimit(int id);

}
