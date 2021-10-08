package be.TechnofuturTIC.foodtrack.models.entities;

import be.TechnofuturTIC.foodtrack.models.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.aspectj.bridge.ICommand;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Foodtruck foodtruck;

    private Status status;

    private String comment;

    private LocalDate date;

}
