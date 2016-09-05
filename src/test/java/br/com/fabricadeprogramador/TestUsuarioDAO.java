package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		
		testExcluir();		
	}
	
	
	public static void testCadastrar(){
		// Criando um usuario
				Usuario usu = new Usuario();
				
				usu.setNome("Jãozão");
				usu.setLogin("jzao");
				usu.setSenha("123");
				
				//Cadastrando usuário no BD
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usu);
				
				System.out.println("Cadastrado com Sucesso!");
	}
	
	
	
	
	public static void testAlterar(){
		// Alterando um usuario
				Usuario usu = new Usuario();
				
				usu.setId(4);
				usu.setNome("Jãozão da Silva");
				usu.setLogin("jzaosss");
				usu.setSenha("123145568");
				
				//Cadastrando usuário no BD
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.alterar(usu);
				
				System.out.println("Alterado com Sucesso!");
	}
	
	
	public static void testExcluir(){
		// Excluindo um usuario
				Usuario usu = new Usuario();		
				usu.setId(4);
				
				//Cadastrando usuário no BD
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.excluir(usu);
				
				System.out.println("Excluido com Sucesso!");
	}
	

}
