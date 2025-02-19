package com.sai.Book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.Book.Entity.SetupForm;

@Repository
public interface SetupFormRepository extends JpaRepository<SetupForm, Long> {
}
