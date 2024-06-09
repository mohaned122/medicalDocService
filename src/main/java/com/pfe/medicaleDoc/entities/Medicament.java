package com.pfe.medicaleDoc.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Medicament {
    String nom;
    String forme;
    int dosage;
    String posologie;
}
