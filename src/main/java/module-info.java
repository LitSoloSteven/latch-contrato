module ni.edu.uam.proyectofinalprogramacionappescritorio.contrato {
    requires com.google.gson;

    exports ni.edu.uam.proyectofinalprogramacionappescritorio.contrato;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.contrato.util;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.comun.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.auth.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.catalogos.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.indicadores.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.mantenimiento.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.pagos.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.tasas.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.validaciones.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.admin.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.adjuntos.dto;
    exports ni.edu.uam.proyectofinalprogramacionappescritorio.api.reportes.dto;

    opens ni.edu.uam.proyectofinalprogramacionappescritorio.contrato to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.comun.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.auth.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.catalogos.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.indicadores.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.mantenimiento.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.pagos.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.tasas.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.validaciones.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.admin.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.adjuntos.dto to com.google.gson;
    opens ni.edu.uam.proyectofinalprogramacionappescritorio.api.reportes.dto to com.google.gson;
}
