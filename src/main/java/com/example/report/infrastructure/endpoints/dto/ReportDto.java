package com.example.report.infrastructure.endpoints.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReportDto {
    private String name;
    private String description;
    private LocalDateTime launchDate;
    private Long duration;
    private Integer totalCapabilities;
    private Integer totalTechnologies;
    private Integer totalPeople;
}
