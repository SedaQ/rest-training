package com.sedaq.training.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Pavel Šeda
 *
 */
@Entity
@Table(name = "contact")
public class Contact implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contact", updatable = false, nullable = false)
	private Long idContact;
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

	public Long getIdContact() {
		return idContact;
	}

	public void setIdContact(Long idContact) {
		this.idContact = idContact;
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
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [idContact=");
		builder.append(idContact);
		builder.append(", contact=");
		builder.append(contact);
		builder.append(", person=");
		builder.append(person);
		builder.append(", contactType=");
		builder.append(contactType);
		builder.append("]");
		return builder.toString();
	}

}
