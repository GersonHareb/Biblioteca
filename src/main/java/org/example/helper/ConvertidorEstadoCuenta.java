package org.example.helper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.example.model.Persona.EstadoCuenta;


@Converter(autoApply = true)
public class ConvertidorEstadoCuenta implements AttributeConverter<EstadoCuenta, String> {

    @Override
    public String convertToDatabaseColumn(EstadoCuenta estadoCuenta) {
        if(estadoCuenta == null){
            return null;
        }
        return estadoCuenta.toString().toUpperCase();
    }

    @Override
    public EstadoCuenta convertToEntityAttribute(String dbData) {
        if(dbData == null){
            return null;
        }
        return EstadoCuenta.valueOf(dbData.toUpperCase());
    }

}
