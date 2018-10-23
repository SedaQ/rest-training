package com.sedaq.training.persistence.model;

import java.io.Serializable;
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
 * 
 * @author Pavel Šeda
 *
 */
@Entity
@Table(name = "relationship_type")
public class RelationshipType implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_relationship_type", updatable = false, nullable = false)
	private Long idRelationshipType;
	@Column(nullable = false, unique = true)
	private String title;
	@OneToMany(targetEntity = Relationship.class, mappedBy = "relationshipType")
	private Set<Relationship> relationships = new HashSet<>();

	public RelationshipType() {
		// hibernate requires non-args constructor
	}

	public Long getIdRelationshipType() {
		return idRelationshipType;
	}

	public void setIdRelationshipType(Long idRelationshipType) {
		this.idRelationshipType = idRelationshipType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(Set<Relationship> relationships) {
		this.relationships = new HashSet<>(relationships);
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
		if (!(obj instanceof RelationshipType))
			return false;
		RelationshipType other = (RelationshipType) obj;
		return Objects.equals(title, other.getTitle());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RelationshipType [idRelationshipType=");
		builder.append(idRelationshipType);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}

}
