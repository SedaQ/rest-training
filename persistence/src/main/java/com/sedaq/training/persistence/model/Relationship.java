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
@Table(name = "relationship")
public class Relationship implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_relationship", updatable = false, nullable = false)
	private Long idRelationship;
	@Column(nullable = true, length = 200)
	private String note;
	@ManyToOne
	@JoinColumn(name = "id_relationship_type")
	private RelationshipType relationshipType;
	@ManyToOne
	@JoinColumn(name = "id_person1")
	private Person person1;
	@ManyToOne
	@JoinColumn(name = "id_person2")
	private Person person2;

	public Relationship() {
		// hibernate requires non-args constructor
	}

	public Long getIdRelationship() {
		return idRelationship;
	}

	public void setIdRelationship(Long idRelationship) {
		this.idRelationship = idRelationship;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public RelationshipType getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(RelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}

	public Person getPerson1() {
		return person1;
	}

	public void setPerson1(Person person1) {
		this.person1 = person1;
	}

	public Person getPerson2() {
		return person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Relationship [idRelationship=");
		builder.append(idRelationship);
		builder.append(", note=");
		builder.append(note);
		builder.append(", relationshipType=");
		builder.append(relationshipType);
		builder.append(", person1=");
		builder.append(person1);
		builder.append(", person2=");
		builder.append(person2);
		builder.append("]");
		return builder.toString();
	}

}
