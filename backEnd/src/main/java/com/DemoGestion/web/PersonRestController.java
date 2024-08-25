package com.DemoGestion.web;

import com.DemoGestion.Dto.PersonDto;
import com.DemoGestion.entities.Client;
import com.DemoGestion.services.PersonService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping ("/api")
public class PersonRestController {

    private final PersonService personService;

    PersonRestController(final PersonService personService){
        this.personService=personService;
    }

    @PostMapping("/persons")
    void create(@RequestBody @Validated PersonDto personDto){

    }

    List<Client> findAll(){
        return null;
    }


}
