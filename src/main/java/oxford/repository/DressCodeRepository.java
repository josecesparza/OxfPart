package oxford.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oxford.model.DressCode;

public interface DressCodeRepository extends JpaRepository <DressCode, Long> {
}
