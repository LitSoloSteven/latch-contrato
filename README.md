# Latch Contrato (`latch-contrato`)

Biblioteca compartida con los DTOs HTTP, constantes de dominio y utilidades puras de validación y formato utilizadas por `latch-api` y `latch-cliente`.

- JDK 21 + Gson 2.13.2 (`module-info.java`: `ni.edu.uam.proyectofinalprogramacionappescritorio.contrato`).
- Sin dependencias de Spring, Hibernate, PostgreSQL, JavaFX, JasperReports ni BouncyCastle.

## Compilación e instalación local

Debe instalarse en el repositorio local de Maven (`~/.m2`) antes de compilar `latch-api` o `latch-cliente` de forma independiente:

```powershell
./mvnw.cmd -B clean install
```
