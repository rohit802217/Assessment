package com.Makersharks.Assessment.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="supplierId")
    private Long supplierId;
    @Column(name="companyName")

    private String companyName;
    @Column(name="website")

    private String website;
    @Column(name="location")

    private String location;
    @Column(name="natureOfBusiness")

    private String natureOfBusiness;
    @Column(name="manufacturingProcesses")

    private String manufacturingProcesses;
}
