# Ejercicio Nº 1: Venta de autos

Una concesionaria de automóviles desea realizar un API REST que le permita realizar la carga de determinados autos
usados.
Para ello, necesitamos desarrollar los siguientes endpoints:

| N° | Endpoint            | Método | Descripción                                                               |
|----|---------------------|--------|---------------------------------------------------------------------------|
| 1  | api/vehicles/       | POST   | Agrega un nuevo automóvil.                                                |
| 2  | api/vehicles/       | GET    | Retorna un listado de todos los autos seleccionados.                      |
| 3  | api/vehicles/prices | GET    | Muestra el listado de los vehículos según los precios (de menor a mayor). |
| 4  | api/vehicles/{id}   | GET    | Muestra toda la información de un auto en particular.                     |

💡Dado que el dueño de la concesionaria es un cliente muy exigente, se sugiere realizar buenas prácticas de programación 
como por ejemplo la separación del proyecto según la Arquitectura Multicapas.

💡Tener en cuenta que por el momento, al no estar trabajando con bases de datos, podemos implementar collections 
(listas, arraylists, etc) para manejar los CRUD de manera lógica. Recordar que, en base a lo último aprendido, 
los datos deben ser cargados desde la capa REPOSITORY.

## Ejemplo de Payload (JSON para método POST)

{
"brand":"Peugeot",
"model":"206",
"kilometers":"150000",
"doors":5,
"price":7500,
}