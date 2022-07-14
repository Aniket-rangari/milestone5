package com.example.mileston_5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mileston_5.entity.ElectronicDevice;

@Repository
public interface Repo extends JpaRepository<ElectronicDevice,Integer>{

}
