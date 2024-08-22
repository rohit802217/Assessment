package com.Makersharks.Assessment.Repository;

import com.Makersharks.Assessment.Entity.Supplier;
 import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {


    List<Supplier> findByAllContaining(String location, String natureOfBusiness, String manufacturingProcess);


   
}
