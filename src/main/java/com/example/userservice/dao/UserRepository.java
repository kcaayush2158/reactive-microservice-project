package com.example.userservice.dao;

import com.example.userservice.model.User;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends ReactiveCassandraRepository<User, UUID> {


}