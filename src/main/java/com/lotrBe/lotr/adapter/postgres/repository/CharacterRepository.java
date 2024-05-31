package com.lotrBe.lotr.adapter.postgres.repository;

import com.lotrBe.lotr.adapter.postgres.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, String> {
}
