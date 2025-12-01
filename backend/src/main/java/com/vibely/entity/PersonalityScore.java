package com.vibely.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PersonalityScore {

    @EqualsAndHashCode.Include
    private UUID id;

    private UUID userId;

    private Integer rawScore; // 0..100
    private PersonalityType type; // INTROVERT, AMBIVERT, EXTROVERT

    /**
     * Optional: map of questionId -> answer (or whatever you store)
     * Use Integer keys for question IDs; if you prefer strings, change to Map<String,Integer> or Map<String,String>.
     */
    private Map<Integer, Integer> quizResponses;

    private LocalDateTime createdAt;
}
