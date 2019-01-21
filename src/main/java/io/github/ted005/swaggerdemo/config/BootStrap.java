package io.github.ted005.swaggerdemo.config;

import io.github.ted005.swaggerdemo.dao.ContactDao;
import io.github.ted005.swaggerdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ContactDao contactDao;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Person person1 = new Person("ted", 1234, "shanghai");
        contactDao.save(person1);

        Person person2 = new Person("mattie", 9876, "beijing");
        contactDao.save(person2);

    }
}
