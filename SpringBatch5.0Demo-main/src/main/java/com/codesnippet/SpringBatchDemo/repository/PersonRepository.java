package com.codesnippet.SpringBatchDemo.repository;

import com.codesnippet.SpringBatchDemo.entity.Person;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findTop10ByOrderByIdAsc();
}
