package com.example.demo.repository;

import com.example.demo.model.Logins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginsRepository extends JpaRepository<Logins, Long> {
}
