package model.vo;

public class Requerimiento3 {
    
    private Integer ID_Proyecto;
    private String Constructora;
    private String Acabados;
    private float Porcentaje_Cuota_Inicial;

    public Requerimiento3() {
    }
    
     public Requerimiento3(Integer ID_Proyecto, String constructora, String Acabados, Float Porcentaje_Cuota_Inicial) {
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = constructora;
        this.Acabados = Acabados;
        this.Porcentaje_Cuota_Inicial = Porcentaje_Cuota_Inicial;
    }
     
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer Id_Proyecto) {
        ID_Proyecto = Id_Proyecto;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    public String getAcabados() {
        return Acabados;
    }
    public void setAcabados(String acabados) {
        Acabados = acabados;
    }
    public Float getPorcentaje_Cuota_Inicial() {
        return Porcentaje_Cuota_Inicial;
    }
    public void setPorcentaje_Cuota_Inicial(Float porcentaje_Cuota_Inicial) {
        Porcentaje_Cuota_Inicial = porcentaje_Cuota_Inicial;
    }
}
