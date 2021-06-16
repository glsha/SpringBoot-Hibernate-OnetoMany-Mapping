package com.example.SpringBoot.Hibernate.OnetoMany.Mapping.Repository;

import com.example.SpringBoot.Hibernate.OnetoMany.Mapping.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long > {
}
