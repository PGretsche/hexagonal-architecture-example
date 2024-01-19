package com.example.todolisthexagonalarchitecture.adapter.in.web;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;
import com.example.todolisthexagonalarchitecture.application.port.in.TodoListUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todolist")
@RequiredArgsConstructor
public class TodoController {

    private final TodoListUseCase todoListUseCase;

    @GetMapping("/todoEntry")
    public TodoEntry getTodoEntry(@RequestParam Integer id) {
        TodoEntry todoEntry = todoListUseCase.getEntry(id);
        return todoEntry;
    }

    @PostMapping("/todoEntry")
    public void saveTodoEntry(@RequestBody TodoEntry todoEntry) {
        todoListUseCase.saveEntry(todoEntry);
        System.out.println("TodoEntry saved");
    }

}
