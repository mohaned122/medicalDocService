package com.pfe.medicaleDoc.Controllers;

import com.pfe.medicaleDoc.entities.Certificate;
import com.pfe.medicaleDoc.entities.Facture;
import com.pfe.medicaleDoc.entities.Ordonnance;
import com.pfe.medicaleDoc.entities.Patient;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@CrossOrigin
public class document {
    @PostMapping("ordonnance")
    public String ordonnance(@RequestBody Ordonnance ordonnance, Model model){
        model.addAttribute("ordonnance", ordonnance);
        return "ordonnace";
    }

    @PostMapping("certificate")
    public String certificate(@RequestBody Certificate certificate, Model model){
        model.addAttribute("certificate", certificate);
        return "certificate";
    }

    @PostMapping("dossier")
    public String Dossier(@RequestBody Patient patient, Model model){
        model.addAttribute("patient", patient);
        return "dossier_medicale";
    }

    @PostMapping("facture")
    public String facture(@RequestBody List<Facture> factures, Model model){
        model.addAttribute("factures", factures);
        return "facture";
    }
}
