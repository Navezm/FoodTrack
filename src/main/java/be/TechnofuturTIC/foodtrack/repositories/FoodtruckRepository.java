package be.TechnofuturTIC.foodtrack.repositories;

import be.TechnofuturTIC.foodtrack.models.entities.Foodtruck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodtruckRepository extends JpaRepository<Foodtruck, Long> {

}
