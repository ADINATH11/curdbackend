package com.CRUD_PROJECT.demo.projects.repository;

import com.CRUD_PROJECT.demo.projects.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
