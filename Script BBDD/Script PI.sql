drop table if exists realiza;
drop table if exists proyectos;
drop table if exists alumno;
drop table if exists area;

Create table area (
	cod_area int auto_increment,
    nombre_area VARCHAR(30) not null,
    descripcion VARCHAR(200),
	constraint cod_area_pk primary key(cod_area)
);

Create table proyectos (
	id_proyecto int auto_increment,
    nombre_proyecto VARCHAR(30) not null,
    URL VARCHAR(200) not null,
    componentes INT,
    año int not null,
    curso VARCHAR(2) not null,
    grupo varchar(5) not null,
    nota int,
    cod_area int,
	constraint id_proyecto_pk primary key(id_proyecto),
    constraint cod_area_proy_fk foreign key (cod_area) references area(cod_area) on delete set null
);

create table alumno (
	id_alumno int auto_increment,
    nombre_alumno VARCHAR(20) not null,
    apellido_alumno VARCHAR(30),
    num_expediente VARCHAR(10) not null,
    constraint id_alumno_pk primary key(id_alumno)
);

create table realiza (
	id_alumno int,
    id_proyecto int,
    constraint realiza_pk primary key (id_alumno, id_proyecto),
    constraint id_alumno_r_fk foreign key (id_alumno) references alumno(id_alumno) on delete cascade,
	constraint id_proyecto_r_fk foreign key (id_proyecto) references proyectos(id_proyecto) on delete cascade
);

insert into area (nombre_area, descripcion) values ('DAW', 'Desarrollo de aplicaciones web');
insert into area (nombre_area, descripcion) values ('DAM', 'Desarrollo de aplicaciones multiplataforma');
insert into area (nombre_area, descripcion) values ('ASIR', 'Administración de sistemas informáticos en red');

insert into alumno (nombre_alumno, apellido_alumno, num_expediente) values ('Lucca', 'Manfredotti', '5643612');
insert into alumno (nombre_alumno, apellido_alumno, num_expediente) values ('Álvaro', 'Serrano', '761533');
insert into alumno (nombre_alumno, apellido_alumno, num_expediente) values ('Ismael', 'Bodas', '98641233');
insert into alumno (nombre_alumno, apellido_alumno, num_expediente) values ('Pablo', 'Naranjo', '76359813');
insert into alumno (nombre_alumno, apellido_alumno, num_expediente) values ('Jorge', 'Burgos', '09178635');
insert into alumno (nombre_alumno, apellido_alumno, num_expediente) values ('Juan Diego', 'Motta', '87654123');

insert into proyectos (nombre_proyecto, url, componentes, año, curso, grupo, nota, cod_area) values ('topanga', 'https://github.com/ismaelbd042/Proyecto_Integrador_Topanga', 3, 2023, '1º', 'DAW', 10, 1);
insert into proyectos (nombre_proyecto, url, componentes, año, curso, grupo, nota, cod_area) values ('PMG', 'https://github.com/JuanDiego/PMG', 3, 2023, '1º', 'DAW', 9, 2);

insert into realiza values (1, 1);
insert into realiza values (2, 1);
insert into realiza values (3, 1);
insert into realiza values (4, 2);
insert into realiza values (5, 2);
insert into realiza values (6, 2);