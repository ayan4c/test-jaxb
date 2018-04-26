package com.test.jaxb.pojos;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "company",
})
@XmlRootElement(name = "User")
public class User {

    @XmlElement(name = "Name", required = true)
    protected String name;

    @XmlElement(name = "Company", required = true)
    protected String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
