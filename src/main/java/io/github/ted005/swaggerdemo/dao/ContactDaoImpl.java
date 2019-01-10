package io.github.ted005.swaggerdemo.dao;

import io.github.ted005.swaggerdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("contactDao")
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createContact(Person newPerson) {

    }

    @Override
    public List<Person> getAllContacts() {
        List<Person> personList = jdbcTemplate.query("select * from person", (rs, row) -> {
            return new Person(rs.getString("name"),
                    rs.getLong("phoneNumber"),
                    rs.getString("address"));
        });
        return personList;
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
