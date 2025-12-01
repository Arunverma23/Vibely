package com.vibely.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Preference {

    @EqualsAndHashCode.Include
    private UUID id;

    private UUID userId;

    private Double preferredLocationLat;
    private Double preferredLocationLng;
    private Integer preferredRadiusKm;

    private Integer budgetMin;
    private Integer budgetMax;

    private PetsPreference petsPreference;
    private Integer cleanlinessPreference; // optional
    private SleepSchedule sleepSchedulePreference; // optional
}
