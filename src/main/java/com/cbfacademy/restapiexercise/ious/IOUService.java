package com.cbfacademy.restapiexercise.ious;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IOUService {
    public final IOURepository iouRepository;

    public IOUService(IOURepository iouRepository) {
        this.iouRepository = iouRepository;
    }

    public List<IOU> getAllIOUS() {
        return iouRepository.findAll(iouRepository);
    }

    
}
