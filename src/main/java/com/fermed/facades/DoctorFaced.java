package com.fermed.facades;

import com.fermed.controllers.DoctorDTO;

public interface DoctorFaced {
 //this class must be checked
    public DoctorDTO createDoctor(DoctorDTO doctor);

    public DoctorDTO getDoctor();
}
