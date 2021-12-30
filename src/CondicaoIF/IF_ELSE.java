package CondicaoIF;

public class IF_ELSE {

	public static void main(String[] args) {
		ifMes();
	}
	private static void ifMes() {
		int mes=5;
		if(mes==1) {
			System.out.println("Janeiro");
		} else if(mes==2) {
			System.out.println("Fevereiro");
		}else if(mes==3) {
			System.out.println("Março");
		}else if(mes==4) {
			System.out.println("Abril");
		}else if(mes==5) {
			System.out.println("Maio");
		}else if(mes==6) {
			System.out.println("Junho");
		}else if(mes==7) {
			System.out.println("Julho");
		}else if(mes==8) {
			System.out.println("Agosto");
		}else if(mes==9) {
			System.out.println("Setembro");
		}else if(mes==10) {
			System.out.println("Outubro");
		}else if(mes==11) {
			System.out.println("Novembro");
		}else {
			System.out.println("Dezembro");
		}
	} //não é o ideal, pois se for entrado qualquer valor que não estiver entre 1 e 11 aparecerá Dezembro
}
