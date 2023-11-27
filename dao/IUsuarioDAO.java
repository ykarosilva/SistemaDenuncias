package br.uft.edu.uft2023.Projeto1.CadastroCliente.dao;

import br.uft.edu.uft2023.Projeto1.CadastroCliente.domain.Cliente;

import java.util.Collection;

/**
 * @author Ykaro Silva, Lucas Yudi Modesto
 */
public interface IClienteDAO {

    public Boolean cadastrar(Usuario usuario);

    public void excluir(Long cpf);

    public void alterar(Usuario usuario);

    public Cliente consultar(Long cpf);

    public Collection<Usuario> buscarTodos();
}
