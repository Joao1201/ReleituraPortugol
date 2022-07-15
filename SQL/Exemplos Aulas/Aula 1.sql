create database db_servico_rh;

use db_servico_rh;

create table tb_user(
id bigint auto_increment,
nome varchar(255) not null,
salario float not null,
primary key(id)
);

select * from tb_user;

insert into tb_user (nome, salario)	values ("Maria", 2500);

alter table tb_user
add descricao varchar(255);

alter table tb_user
change descricao descricao_user varchar(255);

update tb_user set descricao_user = "grandes habilidades" where id = 2;

delete from tb_user where id = 2;