package com.lotrBe.lotr.adapter.postgres.repository;

import com.lotrBe.lotr.adapter.postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
