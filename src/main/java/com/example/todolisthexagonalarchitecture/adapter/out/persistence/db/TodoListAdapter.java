package com.example.todolisthexagonalarchitecture.adapter.out.persistence.db;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;
import com.example.todolisthexagonalarchitecture.application.port.out.TodoListPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class TodoListAdapter implements TodoListPort {
    private final TodoListRepository todoListRepository;

    @Override
    public void saveEntry(TodoEntry todoEntry) {
        ModelMapper modelMapper = new ModelMapper();

        TodoEntryEntity todoEntryEntity = modelMapper.map(todoEntry, TodoEntryEntity.class);
        todoListRepository.save(todoEntryEntity);
    }

    @Override
    public TodoEntry getEntry(Integer id) {
        ModelMapper modelMapper = new ModelMapper();
        Optional<TodoEntryEntity> todoEntryEntity = todoListRepository.findById(id);
        return modelMapper.map(todoEntryEntity, TodoEntry.class);
    }
}
