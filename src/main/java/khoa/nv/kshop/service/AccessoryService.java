package khoa.nv.kshop.service;

import khoa.nv.kshop.dto.AccessoryDto;
import khoa.nv.kshop.form.AccessoryCreateForm;
import khoa.nv.kshop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(Long id, AccessoryUpdateForm form);

    void deleteById(Long id);
}
