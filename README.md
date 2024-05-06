Desarrollar un sistema informático para gestionar operaciones financieras en una
institución bancaria. Se definen dos perfiles de usuario: Gerente y Cajero.

- Seguridad de Acceso: Para llevar a cabo cualquier operación, los usuarios deben
autenticarse con su identificación de usuario y contraseña. La aplicación verificará
estas credenciales antes de permitir el acceso. Solo los usuarios autenticados
correctamente podrán acceder a las funcionalidades de la aplicación, dependiendo
de su perfil.
Si el perfil del usuario es Gerente, podrá realizar las siguientes operaciones:

- Gestión de titulares: Se podrá realizar las operaciones de alta, consulta y
modificación. Por cada titular se tendrá la siguiente información: Dni, Nombre,
Dirección, e-mail.

- Apertura de Cuentas: Para cada nueva cuenta, se registrarán detalles como el
número de cuenta, el dni del titular y el saldo inicial. No se permitirá la creación de
dos cuentas con el mismo número. Para crear una cuenta el titular debe de estar
previamente dado de alta, además un titular puede tener varias cuentas abiertas.

- Gestión de Préstamos: Se registrarán los datos del cliente, el monto(importe) del
préstamo, la tasa de interés y el plazo. No se permitirá la aprobación de un préstamo
si el cliente ya tiene préstamos pendientes.

Si el perfil del usuario es Cajero, podrá:
- Realizar Transacciones: Podrá realizar depósitos (ingresos), retiros(reintegros) y
consultas de saldo en las cuentas de los clientes.
- Validar Préstamos: Podrá revisar el estado de los préstamos y validar los pagos
realizados por los clientes.

Ambos perfiles tendrán la opción de Cerrar Sesión y Salir de la Aplicación.

Notas:
- Los usuarios se registrarán automáticamente al inicio de la aplicación
- El título "Gestión Bancaria" se mostrará en la parte superior de la interfaz.
- Al presionar la tecla <ENTER> en cada campo de texto, se pasará al siguiente..Al
presionar la tecla <ESC> en los campos de texto, se borrarán los datos. Estas
funcionalidades solamente se deben de realizar en el punto de la apertura de
cuentas.
- En la Gestión de Préstamos, se proporcionará una lista desplegable para seleccionar
los clientes existentes.
- Realizar Transacciones, se permitirá al Cajero seleccionar la cuenta del cliente y el tipo
de transacción a realizar.
