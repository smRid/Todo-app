package com.riduan.todoapp.repository;

import com.riduan.todoapp.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity,Long> {
}
