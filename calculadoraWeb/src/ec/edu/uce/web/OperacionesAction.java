package ec.edu.uce.web;



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import com.damaya.spring01.servidor.OperacionesSpring;

@ManagedBean(name = "operacionesAction")
public class OperacionesAction {
	private int x;
	private int y;
	private int resultado;

	private OperacionesSpring servicio;

	@PostConstruct
	public void init() {
		ApplicationContext springContext =  FacesContextUtils
				.getWebApplicationContext(FacesContext.getCurrentInstance());
servicio = springContext.getBean("servicioOp",OperacionesSpring.class);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	
	public String sumar(){
		resultado=servicio.sumar(x, y);
		return "";
		
	}
	public String restar(){
		resultado=servicio.restar(x, y);
		return "";
		
	}
	public String multiplicar(){
		resultado=servicio.multiplicar(x, y);
		return "";
		
	}
	public String dividir(){
		resultado=servicio.dividir(x, y);
		return ""; 
		
	}

}
