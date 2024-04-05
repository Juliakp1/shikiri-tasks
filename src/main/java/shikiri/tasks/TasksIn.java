package shikiri.tasks;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record TasksIn (
    String name,
    String user,
    String description,
    Boolean done
) {
    
}
