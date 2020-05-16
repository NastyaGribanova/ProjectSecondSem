package ru.itis.mushroomnasya.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.mushroomnasya.models.Show;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowDto {
    private int idShow;
    private String name;
    private String genre;
    private String country;

    public static ShowDto from(Show show) {
        return ShowDto.builder()
                .idShow(show.getIdShow())
                .name(show.getName())
                .genre(show.getGenre().name())
                .country(show.getCountry())
                .build();
    }

    public List<ShowDto> from(List<Show> shows) {
        return shows.stream()
                .map(ShowDto::from)
                .collect(Collectors.toList());
    }
}
