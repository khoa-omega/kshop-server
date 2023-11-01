package khoa.nv.kshop.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import khoa.nv.kshop.entity.Car;
import khoa.nv.kshop.repository.CarRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarPkExistsValidator implements ConstraintValidator<CarPkExists, Car.PrimaryKey> {
    private final CarRepository carRepository;


    @Override
    public boolean isValid(Car.PrimaryKey pk, ConstraintValidatorContext context) {
        return carRepository.existsById(pk);
    }
}
