package io.github.ted005.swaggerdemo.dao;

import io.github.ted005.swaggerdemo.pojo.Person;

import java.util.List;

public interface ContactDao {

    void createContact(Person newPerson);

    List<Person> getAllContacts();

    Person getContactByName(String name);

    void updateContact(Person update);

    void deleteContact(Person toBeDeleted);
}
