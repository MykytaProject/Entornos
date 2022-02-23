package javaDoc;
public class EntradaBlogMR {

	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	

	public EntradaBlogMR(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	/** 
	 * test
	 * @return String
	 * Mykyta Ryasny 23/02/2022
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}	
	/** 
	 * test
	 * @return int
	 * Mykyta Ryasny 23/02/2022
	 */
	public int getId(){
		return this.id;
	}

	
	/**
	 * test
	 * Aquí arriba se suele indicar lo que hace el método.
	 * @return String
	 * Aquí debajo se suele indicar lo que se devuelve
	 * Mykyta Ryasny 23/02/2022
	 */
	public String getTexto(){
		return this.texto;
	}	
	/** 
	 * test
	 * @return String
	 * Mykyta Ryasny 23/02/2022
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}	
	/** 
	 * test
	 * @return String
	 * Mykyta Ryasny 23/02/2022
	 */
	public String devuelveAutor(){
		return this.autor;
	}	
	/** 
	 * test
	 * @param args
	 * Mykyta Ryasny 23/02/2022
	 */
	public static void main(String[] args) {

		EntradaBlogMR e1=new EntradaBlogMR (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}