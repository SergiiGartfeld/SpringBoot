package com.sda.ja.twit_demo.mapper;

import com.sda.ja.twit_demo.model.Wpis;
import com.sda.ja.twit_demo.model.dto.WpisDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface WpisMapper {
    @Mappings(value = {
            @Mapping(target = "tresc", source = "wpisTresc"),
            @Mapping(target = "dataUtworzenia", source = "wpisDataUtworzenia"),
            @Mapping(target = "status", source = "wpisStatus"),
            @Mapping(target = "typ", source = "wpisTyp"),
    })
    Wpis wpisDtoToStudent(WpisDto dto);

    @Mappings(value = {
            @Mapping(source = "tresc", target = "wpisTresc"),
            @Mapping(source = "dataUtworzenia", target = "wpisDataUtworzenia"),
            @Mapping(source = "status", target = "wpisStatus"),
            @Mapping(source = "typ", target = "wpisTyp"),

    })
    WpisDto studentToStudentDto(Wpis wpis);
}
