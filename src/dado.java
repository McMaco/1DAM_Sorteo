/***CLASE SORTEO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 15/02/2019
 * CURSO: DM1B
 */
public class dado extends sorteo{
	
	public int lanzar() {
		
		posibilidades = (int) (Math.random() * (6 - 1) + 1);
		return posibilidades;
	}
	
	
	
	 
}
