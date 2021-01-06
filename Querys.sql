CREATE TABLE `usuario` (
  `id` int(6) NOT NULL auto_increment,
  `registrado` BOOLEAN NOT NULL,
  `nombre` varchar(25) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;