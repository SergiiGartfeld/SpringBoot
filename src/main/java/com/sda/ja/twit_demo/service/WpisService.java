package com.sda.ja.twit_demo.service;

import com.sda.ja.twit_demo.mapper.WpisMapper;
import com.sda.ja.twit_demo.model.Wpis;
import com.sda.ja.twit_demo.model.dto.WpisDto;
import com.sda.ja.twit_demo.repository.WpisRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Level;

@Log
@Service
public class WpisService {
    @Autowired
    private WpisRepository repository;
    @Autowired
    private WpisMapper wpisMapper;

    public Optional<Wpis> addWpis(WpisDto wpisDto){
        Wpis wpis = wpisMapper.wpisDtoToStudent(wpisDto);

        try {
            return Optional.of(repository.saveAndFlush(wpis));
        } catch (Exception cvee){
            log.log(Level.SEVERE, "Duplikat wpisu.");
        }
        return Optional.empty();
    }

}
