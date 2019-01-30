package io.github.ted005.swaggerdemo.dao;

import io.github.ted005.swaggerdemo.pojo.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDao extends CrudRepository<Person,Integer> {

    @Query("from Person p where p.address = 'shanghai'")
    List<Person> findPersonsInShanghai();

}
