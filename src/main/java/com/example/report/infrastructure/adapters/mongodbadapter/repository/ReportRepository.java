package com.example.report.infrastructure.adapters.mongodbadapter.repository;

import com.example.report.infrastructure.adapters.mongodbadapter.entity.ReportEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReportRepository extends ReactiveMongoRepository<ReportEntity, String> {
}
