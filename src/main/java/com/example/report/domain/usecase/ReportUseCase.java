package com.example.report.domain.usecase;

import com.example.report.domain.api.IReportServicePort;
import com.example.report.domain.model.Report;
import com.example.report.domain.spi.IReportPersistencePort;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ReportUseCase implements IReportServicePort {
    private final IReportPersistencePort reportPersistencePort;

    @Override
    public Mono<Report> addReport(Report report) {
        return reportPersistencePort.save(report);
    }
}
