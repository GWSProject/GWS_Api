create schema db_gws;
use db_gws;

create table tb_clientes(
	id_cliente binary(16) not null unique,
	id_demanda binary(16) not null unique,
    nome_empresa varchar(255) not null,
    nome_cliente varchar(255) not null,
    telefone varchar(20) not null,
    email varchar(255) not null,
    url_img varchar(255),
    primary key(id_cliente),
    foreign key(id_demanda) references tb_demandas(id_demanda)
);

create table tb_demandas(
	id_demanda binary(16) not null unique,
    titulo varchar(255) not null,
    logo varchar(255) not null,
    descricao text not null,
    anexo varchar(255),
    prioridade bit(2) not null,
    privacidade bit(1) not null,
    status bit(2) not null,
    data_inical datetime not null,
    data_final datetime not null,
    custo double(12,2) not null,
    primary key(id_demanda)
);

create table tb_segmentos(
	id_segmento binary(16) not null unique,
    segmento varchar(150) not null,
    primary key(id_segmento)
);

create table tb_segmentos_demandas(
	id_segmento binary(16) not null unique,
    id_demanda binary(16) not null unique,
    foreign key(id_segmento) references tb_segmentos(id_segmento),
    foreign key(id_demanda) references tb_demandas(id_demanda)
);

create table tb_usuarios(
	id_usuario binary(16) not null unique,
    nome varchar(150) not null,
    tipo_usuario tinyint(4) not null,
    sobrenome varchar(150) not null,
    telefone varchar(20) not null,
    email varchar(100) not null,
    senha varchar(60) not null,
    data_cadastro datetime not null,
    data_ferias datetime not null,
    designacao text not null,
    cidade varchar(255) not null,
    estado varchar(255) not null,
    hora_semanais Time not null,
    primary key(id_usuario)
);

create table tb_hardskills(
	id_hardskill binary(16) not null ,
    nome varchar(150) not null ,
    primary key(id_hardskill)
);

create table tb_softskills(
	id_softskill binary(16) not null ,
    nome varchar(150) not null ,
    primary key(id_softskill)
);

create table tb_hardskills_usuarios(
	id_hardskill binary(16) not null ,
    id_usuario  binary(16) not null ,
    foreign key(id_hardskill) references tb_hardskills(id_hardskill),
    foreign key(id_usuario) references tb_usuarios(id_usuario)
);

create table tb_softskills_usuarios(
	id_softskill binary(16) not null ,
    id_usuario  binary(16) not null ,
    foreign key(id_softskill) references tb_softskills(id_softskill),
    foreign key(id_usuario) references tb_usuarios(id_usuario)
);

create table tb_usuarios_demandas(
	id_usuario  binary(16) not null ,
    id_demanda binary(16) not null ,
    foreign key(id_demanda) references tb_demandas(id_demanda),
    foreign key(id_usuario) references tb_usuarios(id_usuario)
);
