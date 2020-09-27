package com.sedaq.training.persistence.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "contact_type")
public class ContactType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_contact_type", updatable = false, nullable = false)
    private Long id;
    @Column(nullable = false, length = 45, unique = true)
    private String title;
    @OneToMany(targetEntity = Contact.class, mappedBy = "contactType")
    private Set<Contact> contacts = new HashSet<>();

    public ContactType() {
        // hibernate requires non-args constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Contact> getContacts() {
        return Collections.unmodifiableSet(contacts);
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = new HashSet<>(contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ContactType))
            return false;
        ContactType other = (ContactType) obj;
        return Objects.equals(title, other.getTitle());
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
