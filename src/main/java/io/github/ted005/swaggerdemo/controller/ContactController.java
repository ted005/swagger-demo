package io.github.ted005.swaggerdemo.controller;

import io.github.ted005.swaggerdemo.pojo.Person;
import io.github.ted005.swaggerdemo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

    @GetMapping("/persons")
    public Iterable<Person> getAllPersons() {
        return contactService.getAllContacts();
    }

    @GetMapping("/getPersonById")
    public Person getPersonById(@RequestParam("id") int personId) {
        return contactService.getContactById(personId);
    }

    @GetMapping("/inshanghai")
    public Iterable<Person> personsInShanghai() {
        return contactService.peronsInShanghai();
    }
}
