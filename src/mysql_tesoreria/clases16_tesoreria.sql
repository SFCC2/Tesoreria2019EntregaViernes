drop schema if exists Tesoreria;
create database Tesoreria;
use Tesoreria;
/*
@ nombre sulay Cupitra y Hector Torres
*/
 create table Comprobantes(
 comprobante varchar(20),
 descripcion varchar(20),
 Tipo varchar(20),
 cuenta integer,
 primary key (comprobante)
 );
 
create table Centro_Costo(
id integer,
descripcion varchar(20),
Cuenta integer,
primary key (id)
);

create table Maestro_Proveedores(
nit integer,
nombre varchar(20),
direccion varchar(20),
telefono integer,
ciudad varchar(20),
tipo varchar(20),
primary key(nit)
);

create table Moviemientos_Tesoreria(
num_Orden_Pago integer,
cc integer,
nit_Provedor integer,
fecha_Pago date,
ValorPago integer,
nro_Cheque integer,
comprobante varchar(20),
primary key (num_Orden_Pago),
foreign key (cc) references Centro_Costo (id),
foreign key (nit_Provedor) references Maestro_Proveedores (nit),
foreign key (comprobante) references Comprobantes (comprobante)
);