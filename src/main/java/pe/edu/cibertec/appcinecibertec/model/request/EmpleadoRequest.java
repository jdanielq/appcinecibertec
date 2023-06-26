package pe.edu.cibertec.appcinecibertec.model.request;

import java.util.Date;

import lombok.Data;

@Data
public class EmpleadoRequest {

	private Integer idempleado;
	private String nombre;
	private String apellido;
	private Date fechacontrat;
	private Integer idestado;
	
}
