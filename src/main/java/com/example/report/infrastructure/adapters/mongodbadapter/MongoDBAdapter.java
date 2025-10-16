package com.example.report.infrastructure.adapters.mongodbadapter;

import com.example.report.domain.model.Report;
import com.example.report.domain.spi.IReportPersistencePort;
import com.example.report.infrastructure.adapters.mongodbadapter.mapper.IReportEntityMapper;
import com.example.report.infrastructure.adapters.mongodbadapter.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class MongoDBAdapter implements IReportPersistencePort {
    private final ReportRepository repository;
    private final IReportEntityMapper reportEntityMapper;

    @Override
    public Mono<Report> save(Report report) {

        return repository
                .save(reportEntityMapper.toEntity(report))
                .map(reportEntityMapper::toReport);
    }
}
