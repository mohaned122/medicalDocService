package com.pfe.medicaleDoc.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ordonnance {
    String patient;
    String medecin;
    List<Medicament> medicamentList;
    Date date;
}
