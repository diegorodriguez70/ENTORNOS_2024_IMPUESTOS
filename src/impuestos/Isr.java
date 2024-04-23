package impuestos;

public class Isr extends Impuesto{

	@Override
	public double calcularImpuesto(double ingresos) {
		if (ingresos < 50000) {
            return ingresos * 0.20;
        } else {
            return  ingresos * 0.30;
        }

	}

}
