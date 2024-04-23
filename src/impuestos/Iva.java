package impuestos;

public class Iva extends Impuesto{

	/**
	 * Operacion que calcula el iva pidiendo los ingresos
	 * @param double
	 * @return double
	 */
	public double calcularImpuesto(double ingresos) {
        if (ingresos < 10000) {
            return  ingresos * 0.10;
        } else if (ingresos >= 10000 && ingresos < 50000) {
            return  ingresos * 0.15;
        } else {
            return  ingresos * 0.20;
        }

		
	}

}
