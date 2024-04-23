package impuestos;

public class IEPS extends Impuesto {

	@Override
	public double calcularImpuesto(double ingresos) {
		
		return ingresos*0.05;
	}

}
