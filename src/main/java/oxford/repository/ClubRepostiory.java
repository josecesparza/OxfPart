package oxford.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oxford.model.Club;

public interface ClubRepostiory extends JpaRepository<Club, Long> {

}
