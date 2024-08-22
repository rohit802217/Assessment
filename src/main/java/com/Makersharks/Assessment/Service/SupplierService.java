package com.Makersharks.Assessment.Service;

import com.Makersharks.Assessment.Entity.Supplier;
 import org.springframework.data.domain.Page;
 
public interface SupplierService {


    public Page<Supplier> getSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int page, int size) ;


}
