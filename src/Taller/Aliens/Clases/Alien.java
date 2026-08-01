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
	
	
	// Atributos extremidades
	private static final int MAXIMOEXTREMIDADES = 10;
	
	
	
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

	

	// get & set
	public int getTamanio() {	return tamanio;	}

	public String getColor() {	return color;	}

	public int getNumeroOjos() {	return numeroOjos;	}

	public int getNumeroBrazos() {	return numeroBrazos;	}

	public int getNumeroPies() {	return numeroPies;	}

	public double getPrecioExtremidad() {	return precioExtremidad;	}

	public double getPrecioOjo() {	return precioOjo;	}

	public double getPrecioCuerpo() {	return precioCuerpo;	}
	

	
	
	// metodos basicos
	public void imprimir() {
		System.out.println("Tamaño:          " + tamanio);
		System.out.println("Color:           " + color);
		System.out.println("[#] ojos:        " + numeroOjos);
		System.out.println("[#] brazos:      " + numeroBrazos);
		System.out.println("[#] pies:        " + numeroPies);
		System.out.println("[$] extremidad:  " + precioExtremidad);
		System.out.println("[$] ojo:         " + precioOjo);
		System.out.println("[$] cuerpo:      " + precioCuerpo + "\n");
	}
	
	
	
	// Parte 7: Extremidades
	public boolean agregarBrazos(int cantidadBrazos) {
		
		int totalExtremidades = this.numeroBrazos + this.numeroPies + cantidadBrazos;
		
		if( totalExtremidades>=0 && totalExtremidades <= MAXIMOEXTREMIDADES ) {
			numeroBrazos+=cantidadBrazos;			
			return true;

		} else {	return false;		}
		
	}//agregarBrazos
	
		
	public boolean agregarPiernas(int cantidadPiernas) {
		
		int totalExtremidades = this.numeroBrazos + this.numeroPies + cantidadPiernas;
		
		if( totalExtremidades>=0 && totalExtremidades <= MAXIMOEXTREMIDADES ) {
			numeroPies+=cantidadPiernas;			
			return true;

		} else {	return false;		}	
	
	}//agregarPiernas
	
	
	
	public boolean agregarOjos(int  cantidadOjos) {
		
		int maximoOjos=0;
		
		if(this.tamanio >= 5 && this.tamanio <= 10) { 
			maximoOjos = 3;
		} else if(this.tamanio > 10 && this.tamanio <= 20) {
			maximoOjos = 5;
		} else if(this.tamanio > 20 && this.tamanio <= 30) {
			maximoOjos = 7;
		} 
		
		
		int totalOjos = this.numeroOjos + cantidadOjos;
		
		if(totalOjos > maximoOjos) {
			return false;
		} else {
			numeroOjos += cantidadOjos;
			return true;
		}	
			
		
	}//agregarOjos

	
	
	

}//principal