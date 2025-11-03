package com.example.storyEndPoint.controller;

import com.example.storyEndPoint.dto.request.PogramRequest;
import com.example.storyEndPoint.dto.response.ProgramResponse;
import com.example.storyEndPoint.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @PostMapping("/program")
    public ProgramResponse add(@RequestBody PogramRequest request) {
        return programService.add(request);
    }
}
