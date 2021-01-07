
CREATE TABLE `user` (
  `id` int(6) NOT NULL auto_increment,
  `registred` BOOLEAN NOT NULL, --Tiene que ver con el login
  `name` varchar(25) NOT NULL,
  `age` int(6) NOT NULL,   
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;
--Es posible que ENGINE cambie

--PRIMERO SE SELECCIONAN LA CIUDAD DE ORIGEN Y DESTINO
--El horario se trabajará con hora militar y se mostrarán en un combobox de los horarios entre esos dos destinos
--Otras posibles clases: flight(`idflight`, `state`, `hourinit`, `houraend`, `cityinit`, `cityend`,seats, cost)
-- las tarifas son gráficas que dependiendo de el horario y las ciudades tienen un costo diferente
-- esto implica que incluso para dos ciudades en horarios diferentes podría variar el costo
-- asientos es un arreglo
--los estados del vuelo pueden ser in progress, pending, over,...  
-- Para los asientos simplemente se pondrá para cada vuelo 20 asientos y cada que se reserva se le resta
-- uno a los asientos

--reserv(`idreserv`, `iduser`, `idflight`,`valid`  ) 
-- si la (horaini >  horafinvieja) || (horafin <  horainivieja) SI SE PUEDE HACER LA RESERVA 
--SE DEBE TENER EN CUENTA QUE ESTAS HORAS SON CON FECHA Y TODO

--PARA HACER INSERCIONES EN BD

--USERS
insert into user(id,registred,name,age) values(1152441479,'false','Gilbert Rendón',28)
insert into user(id,registred,name,age) values(1152441480,'false','Natalia Gallardo',16)

--FLIGHTS
-- Formato de hora en Colombia Thu Jan 07 11:19:20 COT 2021

--Mon Jan 18 01:00:00 COT 2021
--Mon Jan 18 08:00:00 COT 2021

--Mon Jan 18 09:00:00 COT 2021
--Mon Jan 18 17:00:00 COT 2021 

--Tue Jan 19 08:00:00 COT 2021
--Tue Jan 19 11:00:00 COT 2021

--Tue Jan 19 12:00:00 COT 2021
--Tue Jan 19 15:00:00 COT 2021

insert into flight(idflight,state,hourinit,hourend,cityinit,cityend,seats,cost) 
values(1,'pending','2021/01/18/01','2021/01/18/08','Medellín','Bogotá',20,'100000')

insert into flight(idflight,state,hourinit,hourend,cityinit,cityend,seats,cost) 
values(2,'pending','2021/01/18/09','2021/01/18/17','Medellín','Bogotá',20,'100000')

insert into flight(idflight,state,hourinit,hourend,cityinit,cityend,seats,cost) 
values(3,'pending','Tue Jan 19 08:00:00 COT 2021','Jan 19 11:00:00 COT 2021','Medellín','Rionegro',20,'7500')

insert into flight(idflight,state,hourinit,hourend,cityinit,cityend,seats,cost) 
values(3,'pending','Tue Jan 19 12:00:00 COT 2021','Jan 19 15:00:00 COT 2021','Medellín','Rionegro',20,'7500')