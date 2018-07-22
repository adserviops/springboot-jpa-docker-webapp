package be.g00glen00b.springbootjpawebapp.dao;

import be.g00glen00b.springbootjpawebapp.models.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
}