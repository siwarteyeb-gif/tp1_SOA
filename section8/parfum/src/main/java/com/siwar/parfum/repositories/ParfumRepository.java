package com.siwar.parfum.repositories;

import com.siwar.parfum.entities.Parfum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParfumRepository extends JpaRepository<Parfum, Long> {
}
