package com.substring.auth.auth_app_backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "user_role")

public class Role {

    @Id
    private UUID id = UUID.randomUUID();
    @Column(unique = true,nullable = false)
    private String name;
}
