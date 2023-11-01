package khoa.nv.kshop.controller;

import jakarta.validation.Valid;
import khoa.nv.kshop.dto.AccessoryDto;
import khoa.nv.kshop.form.AccessoryCreateForm;
import khoa.nv.kshop.form.AccessoryUpdateForm;
import khoa.nv.kshop.service.AccessoryService;
import khoa.nv.kshop.validation.AccessoryIdExists;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class AccessoryController {
    private final AccessoryService accessoryService;

    @GetMapping("/api/v1/accessories")
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryService.findAll(pageable);
    }

    @PostMapping("/api/v1/accessories")
    @ResponseStatus(HttpStatus.CREATED)
    public AccessoryDto create(@RequestBody @Valid AccessoryCreateForm form) {
        return accessoryService.create(form);
    }

    @PutMapping("/api/v1/accessories/{id}")
    public AccessoryDto update(
            @PathVariable("id") @AccessoryIdExists Long id,
            @RequestBody @Valid AccessoryUpdateForm form
    ) {
        return accessoryService.update(id, form);
    }

    @DeleteMapping("/api/v1/accessories/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") @AccessoryIdExists Long id) {
        accessoryService.deleteById(id);
    }
}
