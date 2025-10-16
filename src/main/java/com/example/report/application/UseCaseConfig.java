package com.example.report.application;

import com.example.report.domain.api.IReportServicePort;
import com.example.report.domain.spi.IReportPersistencePort;
import com.example.report.domain.usecase.ReportUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public IReportServicePort reportServicePort(
            IReportPersistencePort persistencePort
    ) {
        return new ReportUseCase(persistencePort);
    }

}
