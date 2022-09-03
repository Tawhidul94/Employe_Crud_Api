package com.example.angular_crud.controller;

import com.example.angular_crud.entity.Employe;
import com.example.angular_crud.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employe")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeControler {

    @Autowired
    EmployeService employeService;

    @PostMapping("/save")
    public Employe creareNewEmploye(@RequestBody Employe employe){
        Employe employe1 = this.employeService.saveEmploye(employe);
        return  employe1;
    }

    @PutMapping("/update/{id}")
    public  Employe updateEmploye(@RequestBody Employe employe,@PathVariable long id){
        Employe employe1 = this.employeService.updateEmploye(employe, id);
        return employe1;
    }

    @DeleteMapping("delete/{id}")
    public void  deleteEmploye(@PathVariable Long id){
         this.employeService.deleteEmploye(id);

    }
    @GetMapping("/employe/{id}")
    public Optional<Employe> getSingleEmploye(@PathVariable Long id){
        return this.employeService.findById(id);
    }
    @GetMapping("/allemploye")
    public List<Employe> getAllEmploye(){
        return this.employeService.findAllEmploye();
    }
}
