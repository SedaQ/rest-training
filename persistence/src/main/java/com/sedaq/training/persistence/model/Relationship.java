package com.sedaq.training.persistence.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "relationship")
public class Relationship implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "relationship_id_relationship_seq")
    @SequenceGenerator(name = "relationship_id_relationship_seq", sequenceName = "relationship_id_relationship_seq", initialValue = 1, allocationSize = 50)
    @Column(name = "id_relationship", updatable = false, nullable = false)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Relationship{" +
                "id=" + id +
                ", note='" + note + '\'' +
                '}';
    }
}
