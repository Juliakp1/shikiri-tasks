package shikiri.tasks;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "shikiri-tasks")
public interface TasksController {

    @PostMapping("/tasks")
    public ResponseEntity<TasksOut> create(
        @RequestBody(required = true) TasksIn in
    );

    @PutMapping("/tasks}")
    public ResponseEntity<TasksOut> update(
        @RequestBody(required = true) TasksIn in
    );

    @GetMapping("/tasks")
    public ResponseEntity<TasksOut> getById(
        @RequestBody(required = true) String id
    );

    @GetMapping("/tasks/by-name-containing")
    public ResponseEntity<List<TasksOut>> findByNameContaining(
        @RequestBody(required = true) String name
    );
    
    @GetMapping("/tasks/by-tool")
    public ResponseEntity<List<TasksOut>> findByToolId(
        @RequestBody(required = true) String toolId
    );

    @GetMapping("/tasks/by-board")
    public ResponseEntity<List<TasksOut>> findByBoardId(
        @RequestBody(required = true) String boardId
    );

    @DeleteMapping("/tasks")
    public ResponseEntity<Void> delete(
        @RequestBody(required = true) String id
    );
}
