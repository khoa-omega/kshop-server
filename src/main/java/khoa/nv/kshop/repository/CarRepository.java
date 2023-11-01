package khoa.nv.kshop.repository;

import khoa.nv.kshop.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CarRepository extends
        JpaRepository<Car, Car.PrimaryKey>, JpaSpecificationExecutor<Car> {
}
