package com.fermed.facades;

import com.fermed.model.Doctor;
import com.fermed.services.HomeService;
import lombok.Data;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


public interface HomeFacade{

   @Resource
   private HomeService homeService;



   @Override
   public List<Doctor> getAllDoctors() {
      System.out.println("Siamo passati da controllr through facade through a service");
      return this.homeService.getAllDoctors();
   }


}




