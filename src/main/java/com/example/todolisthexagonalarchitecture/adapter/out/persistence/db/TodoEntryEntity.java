package com.example.todolisthexagonalarchitecture.adapter.out.persistence.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@Builder
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    String content;
    boolean checked;
}
