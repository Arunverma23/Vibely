package com.vibely.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MatchEvent {

    @EqualsAndHashCode.Include
    private UUID id;

    private UUID userId;       // who performed the action
    private UUID targetUserId; // the target of the action

    private MatchAction action; // LIKE or REJECT

    private LocalDateTime createdAt;
}
