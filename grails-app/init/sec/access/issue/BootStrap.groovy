package sec.access.issue

import demo.Role
import demo.Usuario
import demo.UsuarioRole

class BootStrap {

    def init = { servletContext ->
        Role role = new Role(authority: 'ROLE_DETECTIVE').save()
        Usuario usuario = new Usuario(username: 'sherlock', password: 'holmes').save()
        new UsuarioRole(role: role, usuario: usuario).save()

        role = new Role(authority: 'ROLE_POLICE').save()
        usuario = new Usuario(username: 'lestrade', password: 'lestrade').save()
        new UsuarioRole(role: role, usuario: usuario).save()
    }
    def destroy = {
    }
}
