package CondicaoIF;

public class IFFerias {

	public static void main(String[] args) {
		ifFerias();
		
		switchFerias();
	}
	
	private static void ifFerias() { 
		String mes="Fevereiro";
		if(mes=="Janeiro" || mes=="Fevereiro" || mes=="Dezembro") { //melhor usar switch
			System.out.println("F�rias");
		}
	}
	
	private static void switchFerias() {
		String mes="Janeiro";
		switch (mes) {
		case "Janeiro":
		case "Fevereiro":
		case "Julho":
			System.out.println("F�rias");
		break;
		default:
			System.out.println("Inv�lido");
		}
	}
}
