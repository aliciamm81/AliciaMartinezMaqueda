# Ejercicio Nº 1: Plataforma de Gestión de Eventos Académicos

Estás desarrollando una plataforma para la gestión de eventos académicos en una universidad. El objetivo es crear una
API RESTful utilizando Java con Spring Boot que permita a los usuarios ver eventos próximos, registrar nuevos eventos,
inscribir participantes en eventos y obtener detalles específicos de un evento.

Para lograrlo, se requiere implementar los siguientes endpoints:

GET /eventos: Devuelve una lista de todos los eventos académicos próximos.

GET /evento/{id}: Obtiene información detallada de un evento específico mediante su ID.

POST /evento: Permite a los usuarios crear un nuevo evento académico y almacenarlo en una lista.

💡Nota: Utilizar como base de datos una Collection a elección para evitar todavía la configuración de Bases de Datos.

Una vez implementados los endpoints, lleva a cabo pruebas con Postman para verificar que cada uno funcione
correctamente. Al finalizar, exporta la colección de Postman que contiene las pruebas realizadas.

## Ejemplo de JSON para pruebas de POST

```
{
"titulo": "Conferencia de Ciencias Computacionales",
"descripcion": "Una conferencia sobre los avances en inteligencia artificial y aprendizaje automático.",
"fecha": "2023-12-15",
"hora": "10:00",
"lugar": "Aula Magna Centro del Conocimiento",
"ponente": "Dr. Esteban Madrazzo"
}
```

## Pruebas ⚙️

Se introducen las siguientes request en postman:

POST:
localhost:8080/evento
```
Resultado:

Envento creado
```
GET:
localhost:8080/evento
```
Restultado:
[
    {
        "id": 1,
        "titulo": "Master class programación",
        "descripcion": "En esta sesión daremos un curso intensivo sobre programación",
        "fecha": "2023-12-15",
        "hora": "10:00:00",
        "lugar": "Sala de juntas",
        "ponente": "Rodolfo Martín",
        "participantes": [
            {
                "id": 1,
                "nombre": "Alicia",
                "apellidos": "Martín",
                "telefono": 15645613,
                "dni": 564564561
            },
            {
                "id": 2,
                "nombre": "Juan",
                "apellidos": "Gómez",
                "telefono": 98765432,
                "dni": 123456789
            },
            {
                "id": 3,
                "nombre": "María",
                "apellidos": "López",
                "telefono": 45678901,
                "dni": 987654321
            },
            {
                "id": 4,
                "nombre": "Carlos",
                "apellidos": "Sánchez",
                "telefono": 33344455,
                "dni": 444555666
            },
            {
                "id": 5,
                "nombre": "Elena",
                "apellidos": "García",
                "telefono": 111222333,
                "dni": 222333444
            },
            {
                "id": 6,
                "nombre": "Pedro",
                "apellidos": "Fernández",
                "telefono": 777888999,
                "dni": 888999000
            }
        ]
    },
    {
        "id": 2,
        "titulo": "Taller de Desarrollo Web Avanzado",
        "descripcion": "Un taller intensivo sobre las últimas tendencias y técnicas en desarrollo web.",
        "fecha": "2023-12-20",
        "hora": "14:30:00",
        "lugar": "Salón de Conferencias",
        "ponente": "Dra. Andrea Torres",
        "participantes": [
            {
                "id": 7,
                "nombre": "Fernando",
                "apellidos": "Martínez",
                "telefono": 12345678,
                "dni": 987654321
            },
            {
                "id": 8,
                "nombre": "Lucía",
                "apellidos": "González",
                "telefono": 87654321,
                "dni": 123456789
            },
            {
                "id": 9,
                "nombre": "Diego",
                "apellidos": "Pérez",
                "telefono": 45678901,
                "dni": 234567890
            },
            {
                "id": 10,
                "nombre": "Sofía",
                "apellidos": "Sánchez",
                "telefono": 33344455,
                "dni": 555666777
            },
            {
                "id": 11,
                "nombre": "Luisa",
                "apellidos": "Fernández",
                "telefono": 999888777,
                "dni": 777888999
            }
        ]
    }
]
```
GET
localhost:8080/evento/1

```
Restultado:

{
    "id": 1,
    "titulo": "Master class programación",
    "descripcion": "En esta sesión daremos un curso intensivo sobre programación",
    "fecha": "2023-12-15",
    "hora": "10:00:00",
    "lugar": "Sala de juntas",
    "ponente": "Rodolfo Martín",
    "participantes": [
        {
            "id": 1,
            "nombre": "Alicia",
            "apellidos": "Martín",
            "telefono": 15645613,
            "dni": 564564561
        },
        {
            "id": 2,
            "nombre": "Juan",
            "apellidos": "Gómez",
            "telefono": 98765432,
            "dni": 123456789
        },
        {
            "id": 3,
            "nombre": "María",
            "apellidos": "López",
            "telefono": 45678901,
            "dni": 987654321
        },
        {
            "id": 4,
            "nombre": "Carlos",
            "apellidos": "Sánchez",
            "telefono": 33344455,
            "dni": 444555666
        },
        {
            "id": 5,
            "nombre": "Elena",
            "apellidos": "García",
            "telefono": 111222333,
            "dni": 222333444
        },
        {
            "id": 6,
            "nombre": "Pedro",
            "apellidos": "Fernández",
            "telefono": 777888999,
            "dni": 888999000
        }
    ]
}
```
## Nota 📋

El archivo json se encuentra en la raiz del proyecto se llama universidad.postman_collection

## Autores ✒️

* **Alicia Martínez Maqueda** *https://github.com/aliciamm81*