package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    private static final List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", 123, "coupe"));
        carList.add(new Car("Alfa Romeo", 321, "sedan"));
        carList.add(new Car("Mercedes", 771, "cabriolet"));
        carList.add(new Car("VW", 587, "van"));
        carList.add(new Car("Delage", 777, "retro-car"));
    }

    @Override
    public List<Car> getSomeCars(Long id) {
        return carList.stream().limit(id).collect(Collectors.toList());
    }

    public Long getSize(){
        return (long) carList.size();
    }
}
