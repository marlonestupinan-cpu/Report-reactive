package com.example.report.infrastructure.adapters.mongodbadapter.mapper;


import com.example.report.domain.model.Report;
import com.example.report.infrastructure.adapters.mongodbadapter.entity.ReportEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IReportEntityMapper {
    Report toReport(ReportEntity reportEntity);

    ReportEntity toEntity(Report report);
}
