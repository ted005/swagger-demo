package io.github.ted005.swaggerdemo.dao;

import io.github.ted005.swaggerdemo.pojo.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("contactDao")
public class ContactDaoImpl implements ContactDao {
    @Override
    public void createContact(Person newPerson) {

    }

    @Override
    public List<Person> getAllContacts() {
        return null;
    }

    @Override
    public Person getContactByName(String name) {
        return null;
    }

    @Override
    public void updateContact(Person update) {

    }

    @Override
    public void deleteContact(Person toBeDeleted) {

    }
}
