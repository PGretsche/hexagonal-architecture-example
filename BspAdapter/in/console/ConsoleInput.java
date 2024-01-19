package com.example.todolisthexagonalarchitecture.adapter.in.console;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;
import com.example.todolisthexagonalarchitecture.application.port.in.TodoListUseCase;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {

    private final TodoListUseCase todoListUseCase;

    public ConsoleInput(TodoListUseCase todoListUseCase) {
        this.todoListUseCase = todoListUseCase;
    }

    @EventListener(ApplicationReadyEvent.class)
    void runIt() {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Geben sie etwas ein (Id,Checked,Content,Title):");
            String input = scanner.next();

            String[] inputs = input.split(",");

            TodoEntry todoEntry = new TodoEntry();
            todoEntry.setId(Long.getLong(inputs[0]));
            todoEntry.setChecked(Boolean.parseBoolean(inputs[1]));
            todoEntry.setContent(inputs[2]);
            todoEntry.setTitle(inputs[3]);
            todoListUseCase.saveEntry(todoEntry);
        }
    }
}
