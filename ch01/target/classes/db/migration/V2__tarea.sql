CREATE TABLE TAREA (
	idTarea integer NOT NULL,
	nombre varchar(50), 
	descripcion varchar(500),
	idPrioridad integer NOT NULL,
	CONSTRAINT PK_TAREA PRIMARY KEY(id_tarea),
	CONSTRAINT FK_TAREA_idPrioridad FOREIGN KEY (idPrioridad) REFERENCES PRIORIDAD(idPrioridad)
)