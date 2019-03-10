package oxford.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oxford.model.HappyHours;

public interface HappyHoursRepository extends JpaRepository <HappyHours, Long> {
}
