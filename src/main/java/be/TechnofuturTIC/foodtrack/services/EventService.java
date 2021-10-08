package be.TechnofuturTIC.foodtrack.services;

import be.TechnofuturTIC.foodtrack.models.entities.Event;
import be.TechnofuturTIC.foodtrack.models.entities.Foodtruck;
import be.TechnofuturTIC.foodtrack.models.enums.Status;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface EventService {

    List<Event> findAll();
    List<Event> findAllByStatus(Status status);

    List<Event> findAllByDate(LocalDate date);

    List<Event> findAllByFoodtruck(Foodtruck ft);

}
