CREATE TABLE TAREA (
	idTarea serial NOT NULL,
	nombre varchar(50), 
	descripcion varchar(500),
	idPrioridad integer NOT NULL,
	CONSTRAINT PK_TAREA PRIMARY KEY(idTarea),
	CONSTRAINT FK_TAREA_idPrioridad FOREIGN KEY (idPrioridad) REFERENCES PRIORIDAD(idPrioridad)
)