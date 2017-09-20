CREATE SCHEMA PALABRAS AUTHORIZATION sa;
SET SCHEMA PALABRAS;
create table PALABRAS.PALABRAS (
        id integer not null AUTO_INCREMENT,
        idioma varchar(255),
        value varchar(255),
        primary key (id)
    )