import java.util.ArrayList;

public class Medalheiro {
	private ArrayList<Medalha> medalha;

	public Medalheiro(){
		medalha = new ArrayList<Medalha>();
	}

	public boolean cadastraMedalha(Medalha m) {
		for (int i = 0; i < medalha.size(); i++) {
			Medalha med = medalha.get(i);
			if(m.getCodigo() == med.getCodigo())
				return false;
		}
		medalha.add(m);
		return true;
	}

	public Medalha consultaMedalha(int codigo) {
		if(!medalha.isEmpty()){
			for (int i = 0; i < medalha.size(); i++) {
				Medalha m = medalha.get(i);
				if(m.getCodigo() == codigo)
					return m;
			}
		}
		return null;
	}

	public ArrayList<Medalha> consultaMedalhas(String modalidade) {
		ArrayList<Medalha> resultado = new ArrayList<>();

		if (medalha.isEmpty()) return null;

		for(Medalha m : medalha){
			if(m.getModalidade().equals(modalidade)){
				resultado.add(m);
			}
		}
		return resultado;
	}
}