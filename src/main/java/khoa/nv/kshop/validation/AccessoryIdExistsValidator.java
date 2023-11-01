package khoa.nv.kshop.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import khoa.nv.kshop.repository.AccessoryRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccessoryIdExistsValidator implements ConstraintValidator<AccessoryIdExists, Long> {
    private final AccessoryRepository accessoryRepository;

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext context) {
        return accessoryRepository.existsById(id);
    }
}
