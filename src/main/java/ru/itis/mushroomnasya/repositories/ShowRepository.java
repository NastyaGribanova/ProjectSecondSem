package ru.itis.mushroomnasya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.mushroomnasya.models.Genre;
import ru.itis.mushroomnasya.models.Show;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
    Show findByIdShow(int id);
    List<Show> findShowsByGenre(Genre genre);
}
