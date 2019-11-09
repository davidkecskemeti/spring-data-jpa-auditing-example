package com.forloop.spring.data.auditing.repository;

import com.forloop.spring.data.auditing.entity.Bar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {
}
