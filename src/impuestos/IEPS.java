package impuestos;

public class IEPS extends Impuesto {
	/**
	 * Operacion que calcula el IEPS pidiendo los ingresos
	 * @param double
	 * @return double
	 */
	@Override
	public double calcularImpuesto(double ingresos) {
		
		return ingresos*0.05;
	}

}
