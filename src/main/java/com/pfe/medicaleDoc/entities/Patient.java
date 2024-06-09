package com.pfe.medicaleDoc.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Patient {
    String nom;
    String sexe;
    String Sanguin;
    Date age;
    List<Consultation> consultations;
}
