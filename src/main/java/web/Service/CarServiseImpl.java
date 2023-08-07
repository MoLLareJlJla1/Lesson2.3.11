package web.Service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiseImpl implements CarService {
    private CarDao carDao;

    public CarServiseImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList() {
        return carDao.getCarList();
    }

    @Override
    public List<Car> getCarLimit(int id) {
        if (id >= 5) {
            return getCarList();
        }
        return carDao.getCarList().subList(0, id);
    }

}

