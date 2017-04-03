package br.unifor.progweb.dao;

public class ProgramaTeste {
	
	public static void  Main(String[]args) {
		
		JogoDAO jogoDAO = new JogoDAO();
		
	    jogoDAO.gravarNoBanco();
		
	}

}
