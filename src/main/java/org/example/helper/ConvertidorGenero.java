package org.example.helper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.example.model.Persona.Genero;
@Converter(autoApply = true)
public class ConvertidorGenero implements AttributeConverter<Genero, String> {
    @Override
    public String convertToDatabaseColumn(Genero genero) {
        if(genero == null){
            return null;
        }
        return genero.toString().toUpperCase();
    }

    @Override
    public Genero convertToEntityAttribute(String dbData) {
        if(dbData == null){
            return null;
        }
        return Genero.valueOf(dbData.toUpperCase());
    }
}
