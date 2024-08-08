package com.proj.todo.spring_boot_app.Todo;

import jakarta.validation.Valid;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    public static int todoCounts = 0;
    static {
        todos.add(new Todo(++todoCounts, "admin", "Learn spring Boot 1", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCounts, "admin", "Learn JPA 1", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoCounts, "admin", "Learn AWS 1", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        Predicate <? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);

        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todoCounts, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
