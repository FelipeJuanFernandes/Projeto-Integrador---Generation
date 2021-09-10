package br.org.generetion.bluegeneration.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generetion.bluegeneration.model.Usuario;

	@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

		public Optional<Usuario> findByUsuario(String usuario);

		// Usaremos na Sessão de Testes
		public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

		// Usaremos na Sessão de Testes
		public Usuario findByNome(String nome);

}
