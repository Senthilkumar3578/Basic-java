 
package com.example.demo.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Registration;

public interface JpaRepo extends JpaRepository<Registration, Integer> {

   // List<Registration> getByStName(String name, Pageable pageable);

	//Page<Registration> findAll(Pageable pageable);
}
