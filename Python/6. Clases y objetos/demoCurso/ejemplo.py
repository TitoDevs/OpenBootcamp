class Categorias:
    idcategoria = 0
    nombre = ""


class Proveedores:
    idproveedores = 0
    nombre = ""


class Productos:
    idproducto = 0
    CategoriaProducto = Categorias()
    Precio = 0
    Tamaño = 0
    TipoDeProducto = 0
    CIFProveedor = Proveedores()


p = Productos()
p.CIFProveedor.nombre
p.CategoriaProducto.idcategoria
