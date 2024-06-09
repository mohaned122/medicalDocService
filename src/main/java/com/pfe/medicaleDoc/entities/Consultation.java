package com.pfe.medicaleDoc.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Consultation {
    String medecin;
    String description;
    Date date;
}
