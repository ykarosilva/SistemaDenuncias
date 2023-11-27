package br.uft.edu.uft2023.Projeto1.SistemaDenuncias.dao;

import br.uft.edu.uft2023.Projeto1.CadastroCliente.domain.Usuario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ykaro Silva, Lucas Yudi Modesto
 */
public class UsuarioMapDAO implements IUsuarioDAO {

    private HashMap<Usuario, Usuario> map;

    public UsuarioMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Usuario usuario) {
        if (this.map.containsKey(usuario.getCpf())) {
            return false;
        }
        this.map.put(usuario.getCpf(), usuario.getDenuncias(););
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Usuario usuarioCadastrado = this.map.get(cpf);

        if (usuarioCadastrado != null) {
            this.map.remove(usuarioCadastrado);
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        Usuario usuarioCadastrado = this.map.get(usuario.getCpf());
        if (usuarioCadastrado != null) {
            usuarioCadastrado.setNome(usuario.getNome());
            usuarioCadastrado.setTel(usuario.getTel());
            usuarioCadastrado.setNumero(usuario.getNumero());
            usuarioCadastrado.setEnd(usuario.getEnd());
            usuarioCadastrado.setCidade(usuario.getCidade());
            usuarioCadastrado.setEstado(usuario.getEstado());
        }
    }

    @Override
    public Usuario consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Usuario> buscarTodos() {
        return this.map.values();
    }
}
