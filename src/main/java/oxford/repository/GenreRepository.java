package oxford.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oxford.model.Genre;

public interface GenreRepository extends JpaRepository <Genre, Long> {
}
