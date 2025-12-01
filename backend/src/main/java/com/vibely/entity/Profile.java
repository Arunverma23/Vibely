package com.vibely.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Profile {

    @EqualsAndHashCode.Include
    private UUID id;

    private UUID userId;

    private String bio;
    private String gender;
    private Integer age;

    private Double locationLat;
    private Double locationLng;
    private String currentCity;

    private Integer budgetMin;
    private Integer budgetMax;

    private Boolean hasPets;
    private PetsPreference petsPreference;

    private Integer cleanlinessLevel; // 1..5
    private Boolean smoking;
    private SleepSchedule sleepSchedule;

    private LocalDate moveInDate;
    private Integer profileCompletionPercent;
    private LocalDateTime lastActiveAt;
}
