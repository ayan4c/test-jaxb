package com.test.jaxb.resources;

import com.test.jaxb.pojos.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UsersResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersResource.class);

    @PostMapping
    public String createTaxInfo( @RequestBody User object) {
        return object.getName();
    }

}