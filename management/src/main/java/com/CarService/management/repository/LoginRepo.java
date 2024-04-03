package com.CarService.management.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CarService.management.model.*;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {
}