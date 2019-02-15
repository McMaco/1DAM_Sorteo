/***CLASE SORTEO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 15/02/2019
 * CURSO: DM1B
 */
public class moneda extends sorteo{
	
	public int lanzar() {
		
		posibilidades = (int) (Math.random() * 2);
		return posibilidades;
	}
	
	
}
