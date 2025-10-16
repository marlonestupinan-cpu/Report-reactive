package com.example.report.domain.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Report {
    private String id;
    private String name;
    private String description;
    private LocalDateTime launchDate;
    private Long duration;
    private Integer totalCapabilities;
    private Integer totalTechnologies;
    private Integer totalPeople;
}
