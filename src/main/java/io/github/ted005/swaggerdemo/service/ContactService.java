package io.github.ted005.swaggerdemo.service;

import io.github.ted005.swaggerdemo.pojo.Person;

import java.util.List;

public interface ContactService {

    void createContact(Person newPerson);

    List<Person> getAllContacts();

    Person getContactByName(String name);

    void updateContact(Person update);

    void deleteContact(Person toBeDeleted);
}
