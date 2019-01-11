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

    @GetMapping("/getAll")
    public List<Person> getAllPersons() {
        return contactService.getAllContacts();
    }

    @GetMapping("/getPersonByName")
    public Person getPersonByName(@RequestParam("name") String name) {
        return contactService.getContactByName(name);
    }


}
