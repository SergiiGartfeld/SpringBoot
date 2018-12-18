package com.sda.ja.twit_demo.service;

import com.sda.ja.twit_demo.mapper.WpisMapper;
import com.sda.ja.twit_demo.model.Wpis;
import com.sda.ja.twit_demo.model.dto.WpisDto;
import com.sda.ja.twit_demo.repository.WpisRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.stream.Collectors;

@Log
@Service
public class WpisService {
    @Autowired
    private WpisRepository repository;
    @Autowired
    private WpisMapper wpisMapper;

    public Optional<Wpis> addWpis(WpisDto wpisDto){
        Wpis wpis = wpisMapper.wpisDtoToWpis(wpisDto);

        try {
            return Optional.of(repository.saveAndFlush(wpis));
        } catch (Exception cvee){
            log.log(Level.SEVERE, "Duplikat wpisu.");
        }
        return Optional.empty();
    }

    public List<WpisDto> getAll(){
        return repository.findAll().stream()
                .map(wpis -> wpisMapper.wpisToWpisDto(wpis))
                .collect(Collectors.toList());
    }
    public void remove(Long wpisId) {
        repository.deleteById(wpisId);
    }

}
