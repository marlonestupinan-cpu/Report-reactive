package com.example.report.domain.api;

import com.example.report.domain.model.Report;
import reactor.core.publisher.Mono;

public interface IReportServicePort {
    Mono<Report> addReport(Report report);
}
