package be.TechnofuturTIC.foodtrack.services;

import be.TechnofuturTIC.foodtrack.models.entities.Event;
import be.TechnofuturTIC.foodtrack.models.entities.Foodtruck;
import be.TechnofuturTIC.foodtrack.models.enums.Status;
import be.TechnofuturTIC.foodtrack.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository repository;

    @Autowired
    public EventServiceImpl(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Event> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Event> findAllByStatus(Status status) {
        return repository.findAllByStatus(status);
    }

    @Override
    public List<Event> findAllByDate(LocalDate date) {
        return repository.findAllByDate(date);
    }

    @Override
    public List<Event> findAllByFoodtruck(Foodtruck ft) {
        return repository.findAllByFoodtruck(ft);
    }


}
