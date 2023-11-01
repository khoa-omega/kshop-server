package khoa.nv.kshop.service;

import khoa.nv.kshop.dto.CarDto;
import khoa.nv.kshop.entity.Car;
import khoa.nv.kshop.form.CarCreateForm;
import khoa.nv.kshop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);
}
