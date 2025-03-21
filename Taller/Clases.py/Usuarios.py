class Usuarios:
    def __init__(self):
        self.usuarios_lista = []

    def guardarUsuario(self, nombre, nickname, clave):
        usuario = {
            'nombre': nombre,
            'nickname': nickname,
            'clave': clave
        }
        self.usuarios_lista.append(usuario)

    def listarUsuarios(self):
        return self.usuarios_lista
