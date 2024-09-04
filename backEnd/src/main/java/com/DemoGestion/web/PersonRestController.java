package com.DemoGestion.web;

import com.DemoGestion.models.PersonModel;
import com.DemoGestion.entities.Client;
import com.DemoGestion.entities.Person;
import com.DemoGestion.entities.Provider;
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
    void create(@RequestBody @Validated PersonModel personDto){
        //Creer une personn de type Provider ou Client
        if(personDto.getAccountBank() != null && personDto.getRaisonSociale() != null){
            Provider provider = new Provider();
            provider.setRaisonSociale(personDto.getRaisonSociale());
            provider.setAccountBank(personDto.getAccountBank());
            provider.setName(personDto.getName());
            provider.setTelephone(personDto.getTelephone());
            provider.setEmail(personDto.getEmail());
            provider.setAddress(personDto.getAdress());

            this.personService.createProvider(provider);
        } else {
            Client client = new Client();
            client.setName(personDto.getName());
            client.setEmail(personDto.getEmail());
            client.setAddress(personDto.getAdress());
            client.setBirthDay(personDto.getBirthday());
            client.setCode(personDto.getCode());

            this.personService.createClient(client);
        }
    }

    @GetMapping("/persons/clients")
    List<Client> findAllClient(){
        return this.personService.findAllClients();
    }


    @GetMapping("/persons/providers")
    List<Provider> findAllProvider(){
        return this.personService.findAllProviders();
    }

    @GetMapping("/persons/{id}")
    Person findOneById(@PathVariable("id") long id){
        return this.personService.findOnePerson(id);
    }

    @GetMapping("/persons/client/{id}")
    Person findOneClientById(@PathVariable("id") long id){
        return this.personService.findOneClientById(id);
    }

    @GetMapping("/persons/provider/{id}")
    Provider findOneProviderById(@PathVariable("id") long id){
        return this.personService.findOneProviderById(id);
    }

    @DeleteMapping("/persons/{id}")
    void deletedPerson(@PathVariable("id") long id){
        this.personService.deletePerson(id);
    }

}
