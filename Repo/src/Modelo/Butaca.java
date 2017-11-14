package Modelo;

public class Butaca {
	
private Integer numeroButaca;
private Boolean estadoButaca;
private Boolean seleccion;	

//multiples funciones - arreglo con estado / funcion / horario - posible solución


public Integer getNumeroButaca() {
	return numeroButaca;
}

public void setNumeroButaca(Integer numeroButaca) {
	this.numeroButaca = numeroButaca;
}
public Boolean getEstadoButaca() {
	return estadoButaca;
}
public void setEstadoButaca(Boolean estadoButaca) {
	this.estadoButaca = estadoButaca;
}// funcion>pelicula>butacas

public Boolean getSeleccion() {
	return seleccion;
}

public void setSeleccion(Boolean seleccion) {
	this.seleccion = seleccion;
}
}
