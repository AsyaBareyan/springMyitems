package com.example.springmyitems.repository;

import com.example.springmyitems.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
