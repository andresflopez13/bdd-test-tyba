# Proyecto bdd-test-tyba

**Tyba Automatización**

Automatización de pruebas creada para el proyecto de calculadora metro cuadrado


*Si desea conocer más acerca del aplicativo diríjase a la página principal del proyecto en el siguiente enlace [url_base]

---

## Patron 

Para este proyecto se hace uso del patrón Screenplay, este un enfoque para escribir pruebas de aceptación automatizadas de alta calidad basadas en buenos principios de ingeniería de software, como el Principio de responsabilidad única, el Principio abierto-cerrado y el uso efectivo de capas de abstracción. Fomenta los buenos hábitos de prueba y los conjuntos de pruebas bien diseñados que son fáciles de leer, fáciles de mantener y de extender, lo que permite a los equipos escribir pruebas automatizadas más sólidas y confiables de manera más efectiva.
 
## Como esta construido
El proyecto se construyó con las siguientes herramientas:
 - Lenguaje de programación Java
 - IntelliJ IDEA
 - Patron Screenplay
 - Lenguaje Gherkin
 - Cucumber 6
 - Gestor de paquetes Gradle
 - Sistema de versionamiento Git
 - Github como cliente web para almacenar el repositorio
 - Serenity BDD
 - Chromedriver Versión 91.0.4472.101
 

*Si desea conocer mas acerca del patron utilizado diríjase al siguiente enlace [Screenplay con SerenityBDD][screenplay]

---
## Evidencias y reportes
Se adjuntan 3 tipos de reportes los cuales se encuentran en la siguiente ruta del proyecto
 - src/test/resources/reports

En la ruta encontrará:
 - informe de la ejecución a través de la automatización llamado serenity_report en el cual se pueden observar los pasos y casos ejecutados
 - Informe general de la automatización denominado serenity_summary_report
 - Un pequeño archivo en excel donde se reporta un bug encontrado en la calculadora probada, este bug tambien se encuentra reflejado en los reportes de automatización


## Instalación y ejecución 

Para la ejecucion del proyecto es necesaria la siguiente configuracion:

1.	Jdk [java](https://www.java.com/es/download/) configurado en el path de las variables de entorno del sistema
2.	Gestor de dependecias [gradle](https://gradle.org/install/)
3.	[chromedriver](https://chromedriver.chromium.org/downloads) configurado en el path de las variables de entorno del sistema y este debe coincidir con la version de chrome instalada.

---


- - -
[url_base]: https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/
[screenplay]: https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay.html
