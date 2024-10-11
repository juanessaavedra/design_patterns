package patrones_estructurales.facade.facade_laboratory;

public class CasaFacade {
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento;

    public CasaFacade(){
        iluminacion = new SistemaDeIluminacion();
        climatizacion = new SistemaDeClimatizacion();
        seguridad = new SistemaDeSeguridad();
        entretenimiento = new SistemaDeEntretenimiento();
    }

    public void modoNoche(){
        iluminacion.apagarLuces();
        climatizacion.encenderCalefaccion();
        seguridad.activarAlarma();
        entretenimiento.apagarTelevisor();
        System.out.println("Modo noche activado");
    }

    public void modoDia(){
        iluminacion.encenderLuces();
        climatizacion.apagarCalefaccion();
        seguridad.desactivarAlarma();
        entretenimiento.encenderTelevisor();
        System.out.println("Modo día activado");
    }
}
