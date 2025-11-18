
# 💱Conversor de Monedas

Aplicacion de consola desarrollada en Java que permite convertir diferentes monedas en tiempo real utilizando la API de exchangeRate. El proyecto es parte del desafio de Oracle ONE G9.



## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Completado-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## Features

- Conversion en tiempo real de USD, BOB, ARS y BRL.
- Interfaz de consola con menús interactivos.
- Cuenta con validacion de datos de entrada.
- Manejo de errores de conexion a la API.
- Cuenta con formateo de resultados de 2 decimales.
- Opcion para realizar varias conversiones sin reiniciar.




## Demo

https://imgur.com/a/e5dJzS4   
https://imgur.com/RX2RXsw


## Preriquisites
Para ejecutar el programa necesitas tener instalado:

==Java JDK 11 o superior==

==Git==

==Conexion a internet==


## Installation

**Desde tu IDE:**

- Abre el proyecto en IntelliJ IDEA, Eclipse o NetBeans
- Ejecuta la clase `Main.java`
    
## Usage/Examples

## 💻 Uso

### Iniciar la aplicación

Una vez ejecutes el programa, verás el menú principal:

### Flujo de Uso

1. **Menú Principal**
   - Opción 1: Realizar una conversión de moneda
   - Opción 2: Ver las monedas disponibles
   - Opción 3: Salir del programa

2. **Realizar Conversión**
   - Selecciona el par de monedas deseado (ej: USD a BOB)
   - Ingresa la cantidad a convertir
   - El sistema mostrará el resultado
   - Puedes hacer otra conversión o volver al menú principal

3. **Ver Monedas Disponibles**
   - Muestra todas las monedas soportadas
   - Presiona Enter para regresar

### Ejemplo de Conversión
```
Seleccione una opción: 1

*** Selecciona la conversion que quieres realizar ***
1. USD a BOB
2. BOB a USD
3. USD a ARS
4. ARS a USD
5. USD a BRL
6. BRL a USD
7. Salir

Seleccione una opción: 1
Por favor ingrese la cantidad que desea convertir: 50

*******************************************
✓ 50.00 USD equivalen a 347.25 BOB
*******************************************

¿Qué desea hacer?
1. Realizar otra conversión
2. Volver al menú principal
```
## Tech Stack

## 🛠️ Tecnologías Utilizadas

**Lenguaje:**
- Java 17

**Librerías:**
- Gson 2.10.1 - Para parsear respuestas JSON de la API
- Java HttpClient - Para realizar peticiones HTTP

**API Externa:**
- [ExchangeRate-API](https://www.exchangerate-api.com/) - Tasas de cambio en tiempo real

**Herramientas de Desarrollo:**
- IntelliJ IDEA / Eclipse / NetBeans
- Git & GitHub


## Roadmap

## 🚧 Roadmap

Funcionalidades planeadas para futuras versiones:

- [ ] Agregar más monedas (EUR, GBP, JPY, CNY)
- [ ] Implementar historial de conversiones
- [ ] Exportar conversiones a archivo CSV/JSON
- [ ] Modo offline con tasas cacheadas
- [ ] Gráfico de tendencias de tasas de cambio
- [ ] Interfaz gráfica (GUI) con JavaFX
- [ ] Tests unitarios con JUnit
- [ ] Integración con base de datos
## Contributing

## 🤝 Contribuir

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto:

1. Haz un Fork del [proyecto](https://github.com/danielbuscor/Desafio-Conversor-de-Monedas-AluraG9)
2. Crea una rama para tu feature (`git checkout -b feature/NuevaCaracteristica`)
3. Commit tus cambios (`git commit -m 'Add: nueva característica'`)
4. Push a la rama (`git push origin feature/NuevaCaracteristica`)
5. Abre un [Pull Request](https://github.com/danielbuscor/Desafio-Conversor-de-Monedas-AluraG9/pulls)t

### Reportar Bugs

Si encuentras un error, por favor abre un [issue](https://github.com/danielbuscor/Desafio-Conversor-de-Monedas-AluraG9/issues) describiendo:
- El problema encontrado
- Pasos para reproducirlo
- Comportamiento esperado vs actual
## License

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
## Authors

## 👨‍💻 Autor

**Daniel Busco R.**

GitHub: [@danielbuscor](https://github.com/danielbuscor)
- Repositorio: [Desafio-Conversor-de-Monedas-AluraG9](https://github.com/danielbuscor/Desafio-Conversor-de-Monedas-AluraG9)
- LinkedIn: [Daniel Bustamante Cordova.](https://www.linkedin.com/in/daniel-bustamante-cordova-bb8454267/)
- Email: daniel.bus.cor@gmail.com

---

## 🙏 Agradecimientos

- [Alura Latam](https://www.aluracursos.com/) - Por el challenge
- [ExchangeRate-API](https://www.exchangerate-api.com/) - Por la API gratuita
- Comunidad de Java por los recursos educativos

---

⭐ Si este proyecto te fue útil, considera darle una estrella en GitHub ⭐

Desarrollado con ❤️ como parte del programa ONE de Oracle + Alura Latam
