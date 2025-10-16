package com.example.report.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.slf4j.helpers.MessageFormatter;

@Getter
@RequiredArgsConstructor
public enum TechnicalMessage {
    REPORT_ADDED("201", "Reporte creado correctamente"),
    INTERNAL_ERROR("500", "Algo salió mal, intentalo de nuevo"),
    INVALID_REQUEST("400", "Petición erronea, verifica los datos"),
    INVALID_PARAMETERS(INVALID_REQUEST.getCode(), "Parametros erroneos, por favor verifica los datos"),
    ;
    private final String code;
    private final String message;


    public String getMessage(String[] params) {
        return MessageFormatter.arrayFormat(message, params).getMessage();
    }
}
