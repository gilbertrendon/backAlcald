
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
-- seat(`idseat`, `available`  )

--reserv(`idreserv`, `iduser`, `idflight`,`valid`  ) 
-- si la (horaini >  horafinvieja) || (horafin <  horainivieja) SI SE PUEDE HACER LA RESERVA 
--SE DEBE TENER EN CUENTA QUE ESTAS HORAS SON CON FECHA Y TODO

--PARA HACER INSERCIONES EN BD

insert into user(id,registred,name,age) values(1152441479,'false','Gilbert Rendón',28)