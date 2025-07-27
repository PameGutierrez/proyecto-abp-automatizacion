# Proyecto ABP: Suite de Automatización Funcional

## 🎯 Objetivo
Automatizar flujos de registro y login en una aplicación web, cubriendo escenarios exitosos y fallidos, mediante Selenium y TestNG.

## 🗂 Estructura del repositorio

| Carpeta                     | Contenido                                                   |
|----------------------------|-------------------------------------------------------------|
| `1_Codigo_Fuente/`         | Código Java, `pom.xml`, `testng.xml`, pruebas parametrizadas |
| `2_Documentacion_Tecnica/` | Documento Word con arquitectura, configuración y diseño     |
| `5_Repositorio/`           | Archivo `README.txt` con metadatos del repositorio          |

## 🚀 Cómo ejecutar el proyecto

1. Instala Java y Maven.
2. Navega a:
   ```bash
   cd 1_Codigo_Fuente/abp-functional-test
   ```
3. Ejecuta:
   ```bash
   mvn clean test
   ```
4. Revisa:
   - Capturas en `target/screenshots/`
   - Reporte TestNG en `target/surefire-reports/`

## 📦 Publicación en GitHub

1. Crea un repositorio en GitHub llamado **proyecto-abp-automatizacion**
2. Ejecuta los siguientes comandos:

   ```bash
   git init
   git remote add origin https://github.com/PameGutierrez/proyecto-abp-automatizacion.git
   git add .
   git commit -m "Subida completa del Proyecto ABP"
   git branch -M main
   git push -u origin main
   ```

## ✅ Requisitos

- Conexión a internet para WebDriverManager
- `chromedriver` y `geckodriver` si no se utiliza WebDriverManager
- Acceso a la aplicación web para login y registro
