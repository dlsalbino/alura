package br.com.alura.forum.config.validacao;

import br.com.alura.forum.modelo.Usuario;
import br.com.alura.forum.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByEmail(email);
        if (optionalUsuario.isPresent()) {
            System.out.println("USER: " + optionalUsuario.get());
            return optionalUsuario.get();
        }
//
//        return usuarioRepository.findByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado."));
        throw new UsernameNotFoundException("Usuário não encontrado.");
    }
}
