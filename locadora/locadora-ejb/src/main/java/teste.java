import br.unifor.progweb.dao.JogoDAO;
import br.unifor.progweb.entitys.Jogo;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JogoDAO jogoDAO = new JogoDAO();
		
	    jogoDAO.gravarNoBanco();
		
		
	}

}
