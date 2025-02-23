package com.study.Decola_Tech_2025.domain.repository;

import com.study.Decola_Tech_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
