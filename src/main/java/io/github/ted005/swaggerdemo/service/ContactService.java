package io.github.ted005.swaggerdemo.service;

import io.github.ted005.swaggerdemo.pojo.Person;

import java.util.List;

public interface ContactService {

    Iterable<Person> getAllContacts();

    Person getContactById(int id);
}
