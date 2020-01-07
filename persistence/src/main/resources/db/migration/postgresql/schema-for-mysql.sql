CREATE TABLE address (
    id_address BIGINT NOT NULL,
    city varchar(45) NOT NULL,
    house_number integer NOT NULL,
    street varchar(45) NOT NULL,
    zip_code VARCHAR(45)
);

ALTER TABLE address;

CREATE TABLE contact (
    id_contact BIGINT NOT NULL,
    contact varchar(45) NOT NULL,
    id_contact_type bigint,
    id_person bigint
);

ALTER TABLE contact;

CREATE TABLE contact_type (
    id_contact_type BIGINT NOT NULL,
    title varchar(45) NOT NULL
);

ALTER TABLE contact_type;

CREATE TABLE meeting (
    id_meeting BIGINT NOT NULL,
    duration bigint NOT NULL,
    note varchar(1000),
    place varchar(200) NOT NULL,
    start_time timestamp NOT NULL
);


ALTER TABLE meeting;

CREATE TABLE person (
    id_person BIGINT NOT NULL,
    age integer,
    birthday date,
    email VARCHAR(100) NOT NULL,
    first_name VARCHAR(45) NOT NULL,
    nickname VARCHAR(45) NOT NULL,
    pwd VARCHAR(255) NOT NULL,
    surname VARCHAR(45) NOT NULL,
    id_address bigint
);

ALTER TABLE person;

CREATE TABLE person_has_meeting (
    id_person bigint NOT NULL,
    id_meeting bigint NOT NULL
);

ALTER TABLE person_has_meeting;

CREATE TABLE person_role (
    id_person bigint NOT NULL,
    role VARCHAR(255) NOT NULL
);

ALTER TABLE person_role;

CREATE TABLE relationship (
    id_relationship BIGINT NOT NULL,
    note VARCHAR(200),
    id_person1 bigint,
    id_person2 bigint,
    id_relationship_type bigint
);

ALTER TABLE relationship;

CREATE TABLE relationship_type (
    id_relationship_type BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL
);

ALTER TABLE relationship_type;

ALTER TABLE address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id_address);
ALTER TABLE contact
    ADD CONSTRAINT contact_pkey PRIMARY KEY (id_contact)
ALTER TABLE  contact_type
    ADD CONSTRAINT contact_type_pkey PRIMARY KEY (id_contact_type);
ALTER TABLE  meeting
    ADD CONSTRAINT meeting_pkey PRIMARY KEY (id_meeting);
ALTER TABLE  person_has_meeting
    ADD CONSTRAINT person_has_meeting_pkey PRIMARY KEY (id_person, id_meeting);
ALTER TABLE  person
    ADD CONSTRAINT person_pkey PRIMARY KEY (id_person);
ALTER TABLE  person_role
    ADD CONSTRAINT person_role_pkey PRIMARY KEY (id_person, role);
ALTER TABLE  relationship
    ADD CONSTRAINT relationship_pkey PRIMARY KEY (id_relationship);
ALTER TABLE  relationship_type
    ADD CONSTRAINT relationship_type_pkey PRIMARY KEY (id_relationship_type);
ALTER TABLE  contact_type
    ADD CONSTRAINT uk_1fq45jis28gt2u2qt757e04vy UNIQUE (title);
ALTER TABLE  relationship_type
    ADD CONSTRAINT uk_r42xwql4glcbqp0y3r3mo4tac UNIQUE (title);
ALTER TABLE  relationship
    ADD CONSTRAINT fk3b7pcnfgfdblhublf8t8dvn9l FOREIGN KEY (id_relationship_type) REFERENCES relationship_type(id_relationship_type);
ALTER TABLE  person_has_meeting
    ADD CONSTRAINT fk6nyhtkxr5sh5ffdcxefbnwfjj FOREIGN KEY (id_meeting) REFERENCES person(id_person);
ALTER TABLE  person_has_meeting
    ADD CONSTRAINT fk92pqvoxbjila4o02fp18rstq4 FOREIGN KEY (id_person) REFERENCES meeting(id_meeting);
ALTER TABLE  relationship
    ADD CONSTRAINT fkahw6wujjfkm21yqfhar09k3fk FOREIGN KEY (id_person1) REFERENCES person(id_person);
ALTER TABLE  relationship
    ADD CONSTRAINT fkdkyv2jjonl0trwvbsnmw7wugr FOREIGN KEY (id_person2) REFERENCES person(id_person);
ALTER TABLE  person_role
    ADD CONSTRAINT fkqbljdqxhnn666ss0ex4fnbm34 FOREIGN KEY (id_person) REFERENCES person(id_person);
ALTER TABLE  contact
    ADD CONSTRAINT fksdofi6j6flua1it19rnx6xcvb FOREIGN KEY (id_person) REFERENCES person(id_person);
ALTER TABLE  person
    ADD CONSTRAINT fksukp9r53qgth8ex065xwuw86t FOREIGN KEY (id_address) REFERENCES address(id_address);
ALTER TABLE  contact
    ADD CONSTRAINT fkx0wbmi3et03b7xwys8sa0d7 FOREIGN KEY (id_contact_type) REFERENCES contact_type(id_contact_type);
