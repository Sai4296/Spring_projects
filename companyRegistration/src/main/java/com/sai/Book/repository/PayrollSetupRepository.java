package com.sai.Book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.Book.Entity.PayrollSetup;

@Repository
public interface PayrollSetupRepository extends JpaRepository<PayrollSetup, Long> {
}
