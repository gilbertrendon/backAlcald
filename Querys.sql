
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
--Las ciudades con las que se trabajará inicialmente son: Medellín, Bogotá, Rionegro

--psudocodigo:
-- arreglo vuelosconhorariosproisblesentredestinos
--...
-- let cityinitinsertbyuser //la ciudad de partida que ingresa el usuario
-- let cityfinalinsertbyuser // >>         destino >>

--for(let i in res) //res es el json que me retorna el servicio
--if((i["cityinit"] == cityinitinsertbyuser)&&(i["cityend"] == cityfinalinsertbyuser){
--	vuelosconhorariosproisblesentredestinos.add(i)
--}
-- esto se usa para luego mostrar en una vista que sería la vista de las tarifas



--Otras posibles clases: flight(`idflight`, `state`, `hourinit`, `houraend`, `cityinit`, `cityend`,seats, cost)
-- las tarifas son gráficas que dependiendo de las ciudades tienen un costo diferente
--los estados del vuelo pueden ser in progress, pending, over,...  
-- Para los asientos simplemente se pondrá para cada vuelo 20 asientos y cada que se reserva se le resta
-- uno a los asientos

--NOTA: Cuando reservo un vuelo, estoy haciendo un update(primero tendrá un seat menos, también se actualiza el estado)
-- Lo anterior asumiendo que para un vuelo solo importa su estado si almenos tiene un tipulante

--Para estos updates mencionados se borrará el vuelvo con el id seleccionado de vuelosconhorariosproisblesentredestinos de la BD
--Luego se insertará el nuevo elemento selccionado de vuelosconhorariosproisblesentredestinos

--pseudocódigo(java):
--@PostMapping("/addflight")
--public Flight saveFlight(@RequestBody Flight flight){
--  service deleteFlightById(idflight); //Este método va en los services(por ejemplo en el proyecto crud hay guía)
--	return service.saveFlightToDB(flight) //saveFlightToDB va en los services
--}
--NOTA: Si por alguna razón se duplican elementos con la misma clave primaria mirar el proyecto crud en CrudRestController

--reserv(`idreserv`, `iduser`, `idflight`,`valid`  ) 
-- si la (horaini >  horafinvieja) || (horafin <  horainivieja) SI SE PUEDE HACER LA RESERVA 
--SE DEBE TENER EN CUENTA QUE ESTAS HORAS SON CON FECHA Y TODO

--PARA HACER INSERCIONES EN BD

--USERS
insert into user(id,registred,name,age) values(1152441479,'0','Gilbert Rendón',28)
insert into user(id,registred,name,age) values(1152441480,'0','Natalia Gallardo',16)

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
values(4,'pending','Tue Jan 19 12:00:00 COT 2021','Jan 19 15:00:00 COT 2021','Medellín','Rionegro',20,'7500')

--En el módulo de login o loguéo se puede hacer de tal forma que la contraseña sea el documento de cada usuario(user)