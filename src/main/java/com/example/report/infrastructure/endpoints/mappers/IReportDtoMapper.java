package com.example.report.infrastructure.endpoints.mappers;

import com.example.report.domain.model.Report;
import com.example.report.infrastructure.endpoints.dto.ReportDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IReportDtoMapper {
    Report toReport(ReportDto reportDto);
}
