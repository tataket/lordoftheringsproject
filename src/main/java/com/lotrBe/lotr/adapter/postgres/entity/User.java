package com.lotrBe.lotr.adapter.postgres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"user\"", indexes = {@Index(name = "idx_user_email", columnList = "email")})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String userName;

    @Column(unique = true, name="email")
    private String email;
    private String password;
    private boolean isActive;
}
