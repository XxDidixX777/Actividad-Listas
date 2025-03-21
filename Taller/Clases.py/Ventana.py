import tkinter as tk
from Usuarios import Usuarios

usuarios = Usuarios()

def guardar_usuario():
    nombre = entry_nombre.get()
    nickname = entry_nickname.get()
    clave = entry_clave.get()
    usuarios.guardarUsuario(nombre, nickname, clave)
    entry_nombre.delete(0, tk.END)
    entry_nickname.delete(0, tk.END)
    entry_clave.delete(0, tk.END)

def listar_usuarios():
    text_panel.config(state=tk.NORMAL)
    text_panel.delete(1.0, tk.END)
    for usuario in usuarios.listarUsuarios():
        text_panel.insert(tk.END, f"Nombre: {usuario['nombre']}, Nickname: {usuario['nickname']}, Clave: {usuario['clave']}\n")
    text_panel.config(state=tk.DISABLED)

ventana = tk.Tk()
ventana.title('Formulario de Usuarios')
ventana.configure(bg='#FFC0CB')
ventana.geometry('400x500')

label_style = {'bg': '#FFC0CB', 'fg': 'black', 'font': ('Arial', 12, 'bold')}
entry_style = {'bg': 'white', 'fg': 'black', 'font': ('Arial', 12)}

label_nombre = tk.Label(ventana, text='Nombre:', **label_style)
label_nombre.pack(pady=(20, 5))
entry_nombre = tk.Entry(ventana, **entry_style)
entry_nombre.pack(pady=(0, 10))

label_nickname = tk.Label(ventana, text='Nickname:', **label_style)
label_nickname.pack(pady=(10, 5))
entry_nickname = tk.Entry(ventana, **entry_style)
entry_nickname.pack(pady=(0, 10))

label_clave = tk.Label(ventana, text='Clave:', **label_style)
label_clave.pack(pady=(10, 5))
entry_clave = tk.Entry(ventana, show='*', **entry_style)
entry_clave.pack(pady=(0, 20))

btn_style = {'bg': '#E6E6FA', 'fg': 'black', 'font': ('Arial', 12, 'bold'), 'relief': 'raised', 'bd': 3}

btn_guardar = tk.Button(ventana, text='Guardar', command=guardar_usuario, **btn_style)
btn_guardar.pack(pady=(0, 10), ipadx=10, ipady=5)

btn_listar = tk.Button(ventana, text='Listar Usuarios', command=listar_usuarios, **btn_style)
btn_listar.pack(pady=(0, 20), ipadx=10, ipady=5)

text_panel = tk.Text(ventana, bg='#E6E6FA', fg='black', font=('Arial', 10), height=10, width=40)
text_panel.pack(pady=(10, 20))
text_panel.config(state=tk.DISABLED)

ventana.mainloop()