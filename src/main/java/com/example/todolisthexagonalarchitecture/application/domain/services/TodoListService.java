package com.example.todolisthexagonalarchitecture.application.domain.services;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;
import com.example.todolisthexagonalarchitecture.application.port.in.TodoListUseCase;
import com.example.todolisthexagonalarchitecture.application.port.out.TodoListPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoListService implements TodoListUseCase {

    private final TodoListPort todoListPort;


    @Override
    public void saveEntry(TodoEntry todoEntry) {

        todoListPort.saveEntry(todoEntry);
    }

    @Override
    public TodoEntry getEntry(Integer id) {
        
        return todoListPort.getEntry(id);
    }
}
