package web.service;


import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;
import java.util.List;


@Service
public class CarServiceImpl implements CarService{

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getSomeCars(Long size) {
        return carDAO.getSomeCars(size);
    }
    @Override
    public Long getSize(){
        return carDAO.getSize();
    }
}
