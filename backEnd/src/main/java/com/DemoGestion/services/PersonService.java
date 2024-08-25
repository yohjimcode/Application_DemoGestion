package com.DemoGestion.services;

import com.DemoGestion.entities.Client;
import com.DemoGestion.entities.Person;
import com.DemoGestion.entities.Provider;

import java.util.List;

public interface PersonService {

    //PARTIE Provider
    void createProvider(Provider provider);

    List<Provider> findAllProviders(); //avoir la liste des fournisseurs

    void editPerson(Provider provider, long id);


    //PARTIE CLIENT
    void createClient(Client client);

    List<Client> findAllClients(); //avoir la liste des Clients

    void editPerson(Client client, long id);


    //METHODES COMMUNES AUX CLIENTS ET PROVIDERS

    void deletePerson(long id);


}
