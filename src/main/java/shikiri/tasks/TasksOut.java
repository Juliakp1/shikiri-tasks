package shikiri.tasks;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record TasksOut (
    String id,
    String user,
    String name
) {
    
}
