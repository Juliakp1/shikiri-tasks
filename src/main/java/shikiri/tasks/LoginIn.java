package shikiri.tasks;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true, chain = true)
public record LoginIn(
    String id,
    String id_user
) { }
