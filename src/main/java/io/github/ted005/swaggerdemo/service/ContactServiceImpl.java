package io.github.ted005.swaggerdemo.service;

import io.github.ted005.swaggerdemo.dao.ContactDao;
import io.github.ted005.swaggerdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("contactService")
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public void createContact(Person newPerson) {
        this.contactDao.createContact(newPerson);
    }

    @Override
    public List<Person> getAllContacts() {
        return this.contactDao.getAllContacts();
    }

    @Override
    public Person getContactByName(String name) {
        return this.contactDao.getContactByName(name);
    }

    @Override
    public void updateContact(Person update) {
        this.contactDao.updateContact(update);
    }

    @Override
    public void deleteContact(Person toBeDeleted) {
        this.contactDao.deleteContact(toBeDeleted);
    }
}
