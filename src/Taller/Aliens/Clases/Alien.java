package Taller.Aliens.Clases;

public class Alien {
	
	
	// Atributos variables
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	
	
	// Atributos estáticos
	private static final int 	TAMANIOMINIMO = 5;
	private static final int 	TAMANIOMAXIMO = 30;
	private static final double PORCENTAJECUERPO = 0.20;
	private static final double	PORCENTAJEEXTREMIDAD = 0.10;
	private static final double PORCENTAJEOJOS = 0.05;	
	
	
	
	
	// constructores
	public Alien(int tamanio, String color) {
		
		if(tamanio <= TAMANIOMINIMO) {
			tamanio = TAMANIOMINIMO;
		}else if(tamanio >= TAMANIOMAXIMO ) {
			tamanio = TAMANIOMAXIMO;
		}		
		
		this.tamanio = tamanio;
		this.color = color;
		
		this.numeroOjos   = 0;
		this.numeroBrazos = 0;
		this.numeroPies   = 0;
		
		this.precioCuerpo = this.tamanio * PORCENTAJECUERPO;
		this.precioExtremidad = this.tamanio * PORCENTAJEEXTREMIDAD;
		this.precioOjo = this.tamanio * PORCENTAJEOJOS;
		
	}//fin constructor

	

	
	
	

}//principal