package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getCarList() {
        List<Car> mycar= new ArrayList<>();
        mycar.add(new Car("BMW","V6","red"));
        mycar.add(new Car("Mercedes","V8","black"));
        mycar.add(new Car("Audi","V4","white"));
        mycar.add(new Car("Porsche","V6","green"));
        mycar.add(new Car("Lada","v0","yellow"));
        return mycar;
    }
}
