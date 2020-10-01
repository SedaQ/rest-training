package com.sedaq.training.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "relationship_type")
public class RelationshipType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "relationship_type_id_relationship_type_seq")
    @SequenceGenerator(name = "relationship_type_id_relationship_type_seq", sequenceName = "relationship_type_id_relationship_type_seq", initialValue = 1, allocationSize = 50)
    @Column(name = "id_relationship_type", updatable = false, nullable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    private String title;
    @OneToMany(targetEntity = Relationship.class, mappedBy = "relationshipType")
    private Set<Relationship> relationships = new HashSet<>();

    public RelationshipType() {
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
        return "RelationshipType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
