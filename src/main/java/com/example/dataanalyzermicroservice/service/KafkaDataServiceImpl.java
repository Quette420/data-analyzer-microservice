package com.example.dataanalyzermicroservice.service;

import com.example.dataanalyzermicroservice.model.Data;
import com.example.dataanalyzermicroservice.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final DataRepository dataRepository;

    @Override
    public void handle(Data data) {
        log.info("Data object is received " + data);
        dataRepository.save(data);
    }
}
