package com.DemoGestion.services;

import com.DemoGestion.entities.Client;
import com.DemoGestion.entities.Person;
import com.DemoGestion.entities.Provider;
import com.DemoGestion.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //pour avoir une instance
public class PersonServiceImpl implements PersonService {

    //POUR UTILISER PersonRepository
    private final PersonRepository personnRepository;

    PersonServiceImpl(final PersonRepository repository){
        this.personnRepository = repository;
    }

    //PROVIDER

    public void createProvider(Provider provider) {
        this.personnRepository.save(provider);
    }

    @Override
    public List<Provider> findAllProviders() {
        List<Provider> providers = new ArrayList<>();
        for(Person p: this.personnRepository.findAll()){
            if(p instanceof  Provider){
                providers.add((Provider)p);
            }
        }
        return providers;
    }

    //CLIENT

    @Override
    public List<Client> findAllClients() {
        List<Client> clients = new ArrayList<>();
        for(Person p: this.personnRepository.findAll()){
            if(p instanceof  Client){
                clients.add((Client) p);
            }
        }
        return clients;
    }

    @Override
    public void editPerson(Client client, long id) {
        Person person =  this.personnRepository.getReferenceById(id);  //On récupè re la Person qu'"on souhaite modifer
        if(person instanceof Client){
                person.setTelephone(person.getTelephone());
                person.setAddress(person.getAddress());
                ((Client) person).setBirthDay(((Client) person).getBirthDay());
                person.setEmail(person.getEmail());
                person.setName(person.getName());
        }
            this.personnRepository.save(person);
    }


    @Override
    public void createClient(Client client) {
        this.personnRepository.save(client);
    }

    @Override
    public void deletePerson(long id) {
       this.personnRepository.deleteById(id);
        // A CORRIGER
    }

    @Override
    public Person findOnePerson(long id) {
        return this.personnRepository.getReferenceById(id);
    }

    @Override
    public Client findOneClientById(long id) {
        return (Client) this.personnRepository.getReferenceById(id);
    }

    @Override
    public Provider findOneProviderById(long id) {
        return (Provider) this.personnRepository.getReferenceById(id);
    }

    @Override
    public void editPerson(Provider provider, long id) {
       Person person =  this.personnRepository.getReferenceById(id);  //On récupère la Person qu'"on souhaite modifer

        if(person instanceof Provider){
            person.setAddress(provider.getAddress());
            person.setName(provider.getName());
            person.setEmail(provider.getEmail());
            person.setTelephone(provider.getTelephone());
            ((Provider) person).setRaisonSociale(provider.getRaisonSociale());
            ((Provider) person).setAccountBank(provider.getAccountBank());

            this.personnRepository.save(person);
        }
    }

}
