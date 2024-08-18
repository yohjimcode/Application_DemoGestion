package com.DemoGestion.services;

import com.DemoGestion.entities.Client;
import com.DemoGestion.entities.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonServiceImpl(){}
    @Override
    public void createProvider(Provider provider) {

    }

    @Override
    public List<Provider> findAllProviders() {
        return null;
    }

    @Override
    public void deletePerson(long id) {

    }

    @Override
    public void editPerson(Provider provider, long id) {

    }

    @Override
    public void createClient(Provider provider) {

    }

    @Override
    public List<Client> findAllClients() {
        return null;
    }

    @Override
    public void deleteClient(long id) {

    }

    @Override
    public void editClient(Provider provider, long id) {

    }
}
