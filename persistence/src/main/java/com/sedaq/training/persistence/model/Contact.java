package com.sedaq.training.persistence.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "contact")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_id_contact_seq")
    @SequenceGenerator(name = "contact_id_contact_seq", sequenceName = "contact_id_contact_seq", initialValue = 1, allocationSize = 50)
    @Column(name = "id_contact", updatable = false, nullable = false)
    private Long id;
    @Column(nullable = false, length = 45)
    private String contact;
    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "id_contact_type")
    private ContactType contactType;

    public Contact() {
        // hibernate requires non-args constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contact='" + contact + '\'' +
                '}';
    }
}
