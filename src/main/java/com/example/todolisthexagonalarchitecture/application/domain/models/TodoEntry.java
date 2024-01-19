package com.example.todolisthexagonalarchitecture.application.domain.models;

import lombok.Data;

import java.util.UUID;

@Data
public class TodoEntry {

    Long id;
    String title;
    String content;
    boolean checked;
}
