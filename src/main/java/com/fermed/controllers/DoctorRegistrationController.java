package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctorRegistrationController")
public class DoctorRegistrationController {

    @GetMapping("/register")
    public String register(@ModelAttribute DoctorDTO doctorDTO, Model model){
        model.addAttribute("doctorDTO", doctorDTO);
        return "register";
    }
    @PostMapping("/register")
  public void save(DoctorDTO doctorDTO){}
}
