package khoa.nv.kshop.controller;

import jakarta.validation.Valid;
import khoa.nv.kshop.dto.CarDto;
import khoa.nv.kshop.entity.Car;
import khoa.nv.kshop.form.CarCreateForm;
import khoa.nv.kshop.form.CarUpdateForm;
import khoa.nv.kshop.service.CarService;
import khoa.nv.kshop.validation.CarPkExists;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class CarController {
    private final CarService carService;

    @GetMapping("/api/v1/cars")
    public Page<CarDto> findAll(Pageable pageable) {
        return carService.findAll(pageable);
    }

    @PostMapping("/api/v1/cars")
    @ResponseStatus(HttpStatus.CREATED)
    public CarDto create(@RequestBody @Valid CarCreateForm form) {
        return carService.create(form);
    }

    @PutMapping("/api/v1/cars")
    public CarDto update(@RequestBody @Valid CarUpdateForm form) {
        return carService.update(form);
    }

    @DeleteMapping("/api/v1/cars")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@RequestBody @CarPkExists Car.PrimaryKey pk) {
        carService.deleteById(pk);
    }
}
