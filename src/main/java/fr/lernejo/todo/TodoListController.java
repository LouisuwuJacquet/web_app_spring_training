
package fr.lernejo.todo;
//import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {
    TodoRepository todolist;
    public TodoListController(TodoRepository todolist) {
        this.todolist = todolist;
    }
    @GetMapping(value="/api/todo")
    public Iterable<TodoEntity> getList(){
        return todolist.findAll();
    }
    @PostMapping(value = "/api/todo")
    public TodoEntity add(@RequestBody TodoEntity todo){
        return todolist.save(todo);
    }



}
