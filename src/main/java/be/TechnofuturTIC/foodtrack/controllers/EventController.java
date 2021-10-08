package be.TechnofuturTIC.foodtrack.controllers;

import be.TechnofuturTIC.foodtrack.models.entities.Event;
import be.TechnofuturTIC.foodtrack.models.macros.DataTableModel;
import be.TechnofuturTIC.foodtrack.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/planning")
public class EventController {

    private final EventService service;

    @Autowired
    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping("")
    public String home(Model view) {
        List<Event> events = service.findAll();

        DataTableModel<Event, String, Object> model = new DataTableModel();

        for (Event event: events) {
            model.put(event, "Date", event.getDate());
            model.put(event, "Nom du foodtruck", event.getFoodtruck());
            model.put(event, "Statut", event.getStatus());
        }

        view.addAttribute("Planning", model);
        return "model/base/planning";
    }



}
