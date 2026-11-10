package com.siwar.marque.repositories;
import com.siwar.marque.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
    Marque findByMarqueCode(String code);

}