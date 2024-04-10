package shikiri.tasks;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record TasksIn (
    String name,
    String description,
    String tool,
    String board,
    Boolean done
) {
    
}
