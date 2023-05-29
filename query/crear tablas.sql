

create table presupuesto(
idpresupuesto integer not null primary key,
fecha date,
obs varchar(100),
idempleado integer,
idcliente integer,
forma_pago character(100),
estado boolean default false
);
alter table presupuesto add constraint fk_empleados 
foreign key (idempleado) references empleados(idempleado)
on update cascade on delete cascade;
alter table presupuesto add constraint fk_clientes
foreign key (idcliente) references clientes(idcliente)
on update cascade on delete cascade;

create table presupuesto_detalles(
idpresudet integer not null primary key,
idpresupuesto integer,
idmercaderia integer,
cantidad integer,
precio integer,
iva5 integer,
iva10 integer,
ivaexenta integer,
totiva5 integer,
totiva10 integer
);

alter table presupuesto_detalles add constraint fk_presupuesto
foreign key (idpresupuesto) references presupuesto(idpresupuesto)
on update cascade on delete cascade;

alter table presupuesto_detalles add constraint fk_mercaderias
foreign key (idmercaderia) references mercaderias(idmercaderia)
on update cascade on delete cascade;

