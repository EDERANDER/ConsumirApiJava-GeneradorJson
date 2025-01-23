# ProjectFinalApiJava

## Descripción

Este proyecto es una aplicación Java que interactúa con la API de Star Wars (SWAPI) para buscar información sobre las películas de Star Wars. La aplicación permite al usuario ingresar el número de una película y obtener detalles sobre ella, que luego se guardan en un archivo JSON.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes y archivos:

- `main`
  - `App.java`: Contiene la lógica principal de la aplicación.
- `dto`
  - `DTO.java`: Define un registro para mapear los datos JSON de la API.
- `caracteristicas`
  - `StarWars.java`: Define una clase que representa las características de una película de Star Wars.

## Dependencias

El proyecto utiliza las siguientes dependencias:

- `Gson`: Para la serialización y deserialización de JSON.
- `HttpClient`: Para realizar solicitudes HTTP a la API de Star Wars.

## Cómo Ejecutar

1. Clona el repositorio en tu máquina local.
2. Asegúrate de tener Java instalado.
3. Navega al directorio del proyecto.
4. Compila el proyecto utilizando el siguiente comando:
   ```sh
   javac -d bin src/main/App.java src/dto/DTO.java src/caracteristicas/StarWars.java
   ```
5. Ejecuta la aplicación con el siguiente comando:
   ```sh
   java -cp bin main.App
   ```

## Uso

1. Al ejecutar la aplicación, se te pedirá que ingreses el número de una película de Star Wars.
2. La aplicación buscará la información de la película en la API de Star Wars.
3. Si la película ya ha sido buscada anteriormente, se te pedirá que ingreses otro número.
4. La información de la película se mostrará en la consola y se guardará en un archivo JSON llamado `peliculas.json`.

## Ejemplo de Uso

```
Ingrese pelicula que desees buscar: 
1
(titulo=A New Hope, idEpisodio=4, mensajeApertura=It is a period of civil war..., director=George Lucas, fechaLanzamiento=1977-05-25)
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio que desees realizar.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
