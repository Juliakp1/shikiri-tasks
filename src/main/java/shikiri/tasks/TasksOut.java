package shikiri.tasks;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record TasksOut (
    String id_task,
    String ts_user,
    String ts_name
) {
    
}
