package com.cvbank.application.controller.implimentation;

import com.cvbank.application.DTO.RegistrationRequestHunter;
import com.cvbank.application.DTO.RegistrationRequestSeeker;
import com.cvbank.application.controller.RegistrationController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationControllerImpl implements RegistrationController {

    @PostMapping
    public void RegistrationSeeker(@RequestBody RegistrationRequestSeeker request) {

    }

    @PostMapping
    public void RegistrationHunter(@RequestBody RegistrationRequestHunter request) {

    }
}
