package shikiri.tasks;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "shikiri-tasks")
public interface TasksController {

    @PostMapping("/tasks")
    public ResponseEntity<TasksOut> create(
        @RequestBody(required = true) String user,
        @RequestBody(required = true) TasksIn in
    );

    @PutMapping("/tasks/{id}")
    public ResponseEntity<TasksOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) String user,
        @RequestBody(required = true) TasksIn in
    );

    @GetMapping("/tasks")
    public ResponseEntity<TasksOut> read(
        @RequestHeader(required = true, name = "id-user") String idUser,
        @RequestHeader(required = true, name = "role-user") String roleUser,
        @RequestHeader(required = true, name = "id-task") String idTask
    );
    
}