import java.util.ArrayList;

public class Plantel {
	private ArrayList<Atleta> atleta;

	public Plantel(){
		atleta = new ArrayList<Atleta>();
	}

	public boolean cadastraAtleta(Atleta a) {
		for (int i = 0; i < atleta.size(); i++) {
			Atleta at = atleta.get(i);
			if(a.getNumero() == at.getNumero())
				return false;
		}
		atleta.add(a);
		return true;
	}

	public Atleta consultaAtleta(String nome) {
		if(!atleta.isEmpty()) {
			for(int i=0; i<atleta.size() ;i++) {
				Atleta a = atleta.get(i);
				if(a.getNome().equals(nome))
					return a;
			}
		}
		return null;
	}

	public Atleta consultaAtleta(int numero) {
		if(!atleta.isEmpty()) {
			for(int i=0; i<atleta.size() ;i++) {
				Atleta a = atleta.get(i);
				if(a.getNumero() == numero)
					return a;
			}
		}
		return null;
	}

}