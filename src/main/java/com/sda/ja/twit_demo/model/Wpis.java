package com.sda.ja.twit_demo.model;

import com.sda.ja.twit_demo.en.Status;
import com.sda.ja.twit_demo.en.Typ;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Wpis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 160)
    private String tresc;

    @CreationTimestamp
    private LocalDateTime dataUtworzenia;


    private Status status;
    private Typ typ;




}
