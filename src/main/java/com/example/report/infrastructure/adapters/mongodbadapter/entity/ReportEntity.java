package com.example.report.infrastructure.adapters.mongodbadapter.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Document(collection = "reporte")
public class ReportEntity {
    @Id
    private String id;
    @Field("nombre")
    private String name;
    @Field("descripcion")
    private String description;
    @Field("fecha_lanzamiento")
    private LocalDateTime launchDate;
    @Field("duracion")
    private Long duration;
    @Field("capacidades_total")
    private Integer totalCapabilities;
    @Field("tecnologias_total")
    private Integer totalTechnologies;
    @Field("personas_total")
    private Integer totalPeople;
}
