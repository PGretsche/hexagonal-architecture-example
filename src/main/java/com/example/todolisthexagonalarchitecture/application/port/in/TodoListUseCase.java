package com.example.todolisthexagonalarchitecture.application.port.in;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;

public interface TodoListUseCase {

    void saveEntry(TodoEntry todoEntry);

    TodoEntry getEntry(Integer id);
}
