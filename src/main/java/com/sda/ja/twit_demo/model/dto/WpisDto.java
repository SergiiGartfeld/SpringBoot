package com.sda.ja.twit_demo.model.dto;

import com.sda.ja.twit_demo.en.Status;
import com.sda.ja.twit_demo.en.Typ;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WpisDto {
    private Long wpisId;
    private String wpisTresc;
    private LocalDate wpisDataUtworzenia;
    private Status wpisStatus;
    private Typ wpisTyp;
}
