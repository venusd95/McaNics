package com.mcanics.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcanics.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
