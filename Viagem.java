import java.util.Date;

public class Viagem {

	private int idViagem;
	private String destino;
	private Date dataInicial;
	private Date dataFinal;
	private int kmPecorrido;
	private Veiculo veiculo;
	
	public Viagem(int idViagem, String destino, Date dataInicial, Date dataFinal) {
		super();
		this.idViagem = idViagem;
		this.destino = destino;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.kmPecorrido = 0;
	}
	
	public boolean iniciarViagem(Veiculo veiculo) { 
		if(veiculo.getStatus() =='D' ) {
			this.veiculo = veiculo;
			this.dataInicial = new Date();
			veiculo.registrarViagem();
			return true;
		}
		else {
			return false;
		}
	}
	
	public void finalizarViagem(int kmOdometro) {
		this.dataFinal = new Date();
		this.kmPecorrido = calcularkmPercorrido(kmOdometro);
		veiculo.registrarRetorno(kmOdometro);
		
	}
	
	public int calcularkmPercorrido(int kmOdometro) {
		this.kmPecorrido = kmOdometro - veiculo.getKmOdometro();
		return kmPecorrido;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public int getKmPecorrido() {
		return kmPecorrido;
	}

	public void setKmPecorrido(int kmPecorrido) {
		this.kmPecorrido = kmPecorrido;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getIdViagem() {
		return idViagem;
	}
	
}
