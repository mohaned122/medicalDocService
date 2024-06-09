package com.pfe.medicaleDoc.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Certificate {
    String docteur;
    String patient;
    Date naissance;
    String symptomes;
    String Activite;
    String traitement;
    String cabinet;
    Date consultation;
}
