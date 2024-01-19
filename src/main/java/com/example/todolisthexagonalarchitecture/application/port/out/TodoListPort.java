package com.example.todolisthexagonalarchitecture.application.port.out;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;

public interface TodoListPort {

    void saveEntry(TodoEntry todoEntry);

    TodoEntry getEntry(Integer id);
}
