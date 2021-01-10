package com.space.repository;

/**
 * @author Ruslan Tanas { @literal <skyuser13@gmail.com>}
 */

import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
