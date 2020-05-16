package ru.itis.mushroomnasya.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "my_shows")
public class Show {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idShow;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @Column(name = "country")
    private String country;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> userList;

}
