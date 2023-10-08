package com.example.test.service.imp;

import com.example.test.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImp implements TestService {
    @Override
    public String print99() {
        StringBuilder s = new StringBuilder("");
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                s.append(i + "*" + j + "=" + i*j + "\t");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
