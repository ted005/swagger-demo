package io.github.ted005.swaggerdemo.service;

import io.github.ted005.swaggerdemo.dao.ContactDao;
import io.github.ted005.swaggerdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public Iterable<Person> getAllContacts() {
        return contactDao.findAll();
    }

    @Override
    public Person getContactById(int id) {
        Optional<Person> optional = contactDao.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<Person> peronsInShanghai() {
        return contactDao.findPersonsInShanghai();
    }


}
