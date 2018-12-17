package com.sda.ja.twit_demo.model;

import com.sda.ja.twit_demo.en.Status;
import com.sda.ja.twit_demo.en.Typ;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Wpis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tresc;

    @CreationTimestamp
    private LocalDate dataUtworzenia;
    private Status status;
    private Typ typ;




}
