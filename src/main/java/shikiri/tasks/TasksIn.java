package shikiri.tasks;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record TasksIn (
    String ts_name,
    String ts_user,
    String description,
    Boolean ts_done
) {
    
}
