package com.example.demo.repository;

import com.example.demo.data.Native;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NativeRepository extends JpaRepository<Native,String> {

}
