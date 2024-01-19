package com.example.todolisthexagonalarchitecture.adapter.out.persistence.db;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoEntryEntity, Integer> {

}
