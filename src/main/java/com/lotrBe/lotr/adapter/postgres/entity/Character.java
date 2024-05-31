package com.lotrBe.lotr.adapter.postgres.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"character\"")
public class Character {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String characterName;
    private String health;
    private String damage;

}
