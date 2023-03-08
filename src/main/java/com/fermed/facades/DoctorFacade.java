package com.fermed.facades;

import com.fermed.controllers.DoctorDTO;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.print.Doc;


public class DoctorFacade {

   @Resource
   private DoctorService doctorService;
   

}




