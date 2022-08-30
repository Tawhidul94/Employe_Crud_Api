package com.example.angular_crud.serviceImpl;


import com.example.angular_crud.entity.Employe;
import com.example.angular_crud.repository.EmployeRepojetory;
import com.example.angular_crud.service.EmployeService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepojetory employeRepojetory;

    @Override
    public Employe saveEmploye(Employe employe) {
        Employe save = this.employeRepojetory.save(employe);
        return save;
    }

    @Override
    public Employe updateEmploye(Employe employe,Long id) {
        Employe employe1 = this.employeRepojetory.findById(id).get();
        employe1.setFirstName(employe.getFirstName());
        employe1.setLastName(employe.getLastName());
        employe1.setPhone(employe.getPhone());
        Employe updateEmloye = this.employeRepojetory.save(employe1);
        return updateEmloye;
    }

    @Override
    public void deleteEmploye(Long id) {
        this.employeRepojetory.deleteById(id);

    }

    @Override
    public Optional<Employe> findById(Long id) {
        Optional<Employe> byId = this.employeRepojetory.findById(id);
        return byId;


    }

    @Override
    public List<Employe> findAllEmploye() {
        return this.employeRepojetory.findAll();
    }
}
