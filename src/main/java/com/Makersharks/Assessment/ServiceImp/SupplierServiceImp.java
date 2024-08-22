package com.Makersharks.Assessment.ServiceImp;

import com.Makersharks.Assessment.Entity.Supplier;
import com.Makersharks.Assessment.Repository.SupplierRepository;
import com.Makersharks.Assessment.Service.SupplierService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SupplierServiceImp implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Page<Supplier> getSuppliers(String location,
            String natureOfBusiness,
            String manufacturingProcess,
            int page,
            int size) {

        return (Page<Supplier>) supplierRepository.findByAllContaining(
                location, natureOfBusiness, manufacturingProcess, PageRequest.of(page, size));
    }
}