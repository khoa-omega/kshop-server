package khoa.nv.kshop.repository;

import khoa.nv.kshop.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccessoryRepository extends
        JpaRepository<Accessory, Long>, JpaSpecificationExecutor<Accessory> {
}
