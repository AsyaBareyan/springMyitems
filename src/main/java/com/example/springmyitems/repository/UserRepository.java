package com.example.springmyitems.repository;

import com.example.springmyitems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findAllByName(String name);
}
