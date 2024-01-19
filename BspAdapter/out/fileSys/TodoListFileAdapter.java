package com.example.todolisthexagonalarchitecture.adapter.out.persistence.fileSys;

import com.example.todolisthexagonalarchitecture.application.domain.models.TodoEntry;
import com.example.todolisthexagonalarchitecture.application.port.out.TodoListPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@RequiredArgsConstructor
@Component
public class TodoListFileAdapter implements TodoListPort {

    @Override
    public void saveEntry(TodoEntry todoEntry) {
        try {
            PrintWriter writer = new PrintWriter("the-file-name.txt", StandardCharsets.UTF_8);
            writer.print(todoEntry);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public TodoEntry getEntry(Integer id) {
        return null;
    }
}
