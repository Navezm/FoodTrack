package be.TechnofuturTIC.foodtrack.models.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode
@ToString
public class Foodtruck {
    @Id
    private Long id;

    private String name;

    private String phoneNumber;

    private String website;

    private boolean isActive;


    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private User user;
}
