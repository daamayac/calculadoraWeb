package ec.edu.uce.serv;


public class OperacionesBasicasImpl implements OperacionesBasicas {

	public OperacionesBasicasImpl() {
	}

	@Override
	public int sumar(int x, int y) {
		return x + y;
	}

	@Override
	public int restar(int x, int y) {
		return x - y;
	}

	@Override
	public int multiplicar(int x, int y) {
		return x * y;
	}

	@Override
	public int dividir(int x, int y) {
		if (y != 0) {
			return x / y;
		} else
			return -99999;
	}

}
