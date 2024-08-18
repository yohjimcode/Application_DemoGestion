package com.DemoGestion.services;

import com.DemoGestion.entities.Client;
import com.DemoGestion.entities.Person;
import com.DemoGestion.entities.Provider;

import java.util.List;

public interface PersonService {
    void createProvider(Provider provider);
    List<Provider> findAllProviders(); //avoir la liste des fournisseurs

    void deletePerson(long id);
    void editPerson(Provider provider, long id);

    void createClient(Provider provider);
    List<Client> findAllClients(); //avoir la liste des Clients
    void deleteClient(long id);
    void editClient(Provider provider, long id);
}
