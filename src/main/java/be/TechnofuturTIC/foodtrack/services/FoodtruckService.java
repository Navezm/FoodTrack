package be.TechnofuturTIC.foodtrack.services;

import be.TechnofuturTIC.foodtrack.models.entities.Foodtruck;

import java.util.List;

public interface FoodtruckService {

    List<Foodtruck> findAllByActive();
    List<Foodtruck> findAllByUser();
    List<Foodtruck> findAllById();
}
