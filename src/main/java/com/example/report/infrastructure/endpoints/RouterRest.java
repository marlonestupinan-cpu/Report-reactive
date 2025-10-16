package com.example.report.infrastructure.endpoints;

import com.example.report.infrastructure.endpoints.dto.ReportDto;
import com.example.report.infrastructure.endpoints.handler.ReportHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springdoc.core.annotations.RouterOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {
    @Bean
    @RouterOperations({
            @RouterOperation(
                    path = "/report",
                    method = RequestMethod.POST,
                    beanClass = ReportHandler.class,
                    beanMethod = "createReport",
                    operation = @Operation(
                            operationId = "createReport",
                            summary = "Create a new report",
                            tags = {"Reports"},
                            requestBody = @RequestBody(
                                    description = "New report data",
                                    required = true,
                                    content = @Content(schema = @Schema(implementation = ReportDto.class))
                            ),
                            responses = {
                                    @ApiResponse(responseCode = "200", description = "Report created successfully"),
                                    @ApiResponse(responseCode = "400", description = "Invalid input data")
                            }
                    )
            )
    })
    public RouterFunction<ServerResponse> routerFunction(ReportHandler reportHandler) {
        return route(POST("/report"), reportHandler::createReport);
    }
}
