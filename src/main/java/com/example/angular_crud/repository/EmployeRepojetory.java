package com.example.angular_crud.repository;

import com.example.angular_crud.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepojetory  extends JpaRepository<Employe,Long> {


}
