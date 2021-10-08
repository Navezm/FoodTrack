package be.TechnofuturTIC.foodtrack.repositories;

import be.TechnofuturTIC.foodtrack.models.entities.Event;
import be.TechnofuturTIC.foodtrack.models.entities.Foodtruck;
import be.TechnofuturTIC.foodtrack.models.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findAll();
    List<Event> findAllByStatus(Status status);
    List<Event> findAllByDate(LocalDate date);
    List<Event> findAllByFoodtruck(Foodtruck ft);

}
