package pe.edu.cibertec.appcinecibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appcinecibertec.model.bd.Empleado;
import pe.edu.cibertec.appcinecibertec.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<Empleado> listarEmpleado(){
		return empleadoRepository.findAll();
	}
	
	public void registrarEmpleado(Empleado empleado) {
		empleadoRepository.registrarEmpleado(empleado.getNombre(), empleado.getApellido());
	}
	
	public void eliminarEmpleado(Integer idempleado) {
		empleadoRepository.deleteById(idempleado);
	} 
}
