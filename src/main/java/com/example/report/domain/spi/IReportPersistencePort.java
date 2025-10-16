package com.example.report.domain.spi;

import com.example.report.domain.model.Report;
import reactor.core.publisher.Mono;

public interface IReportPersistencePort {
    Mono<Report> save(Report report);
}
