package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Player entity.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
