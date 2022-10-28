package com.example.springdatajpa.springdatajpabatch4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.springdatajpabatch4.model.Post;


@Repository
public interface PostDao extends JpaRepository<Post,Integer> {

}
