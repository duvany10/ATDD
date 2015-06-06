import javax.naming.spi.DirStateFactory.Result;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;


public class CodeBreaker {
	
	String numeroOculto = "2345";
	
	public CodeBreaker(){}
	
	public String encontrarNumero(String nroEntrada){
		String resultadoX ="", resultado_="";
		for(int i=0; i<nroEntrada.length(); i++)
		{
			if(nroEntrada.charAt(i)==numeroOculto.charAt(i))
			{
				resultadoX+="X";
			}
			else
			{
				if(numeroOculto.contains(nroEntrada.charAt(i)+""))
				{
					resultado_+="_";
				}
			}
		}
		
		return resultadoX+resultado_;
	}
	
	public int nroDigitos(String entrada){
	
	return entrada.length();
		
	}
	
	public int comparar(String nroEntrada)	
	{
		char aux, aux2;
		int coincidencias=0;		
		for(int i=0; i<nroEntrada.length(); i++)
		{
			aux = nroEntrada.charAt(i);
			aux2 = numeroOculto.charAt(i);
			if(aux==aux2){
				coincidencias++;
			}
		}
		return coincidencias;
		
	}
	
	public int nroGiones(String nroEntrada){
		
		char aux,aux2;
		int coincidencia=0;
		for(int i=0; i<nroEntrada.length();i++){
			aux = nroEntrada.charAt(i);
			for(int j=0; j<nroEntrada.length();j++){
				aux2 = numeroOculto.charAt(i);
				if(aux==aux2){
					coincidencia++;
				}
			}
		}
		return coincidencia;
	}
	
	public String comparacionFinal(String valorEntrado){
		int nroX = this.comparar(valorEntrado);
		int nroG = this.nroGiones(valorEntrado);
		int nroVacio = 4-nroX-nroG;		
		StringBuilder sbx = new StringBuilder();	
		
		
		for(int i = 0; i < nroX; i++){
			sbx.append('x');
		}
		for(int i = 0; i < nroG; i++){
			sbx.append('_');
		}
		for(int i = 0; i < nroVacio; i++){
			sbx.append(' ');
		}		
		return sbx.toString();				
	}
	
	
}
