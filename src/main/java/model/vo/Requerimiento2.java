package model.vo;

public class Requerimiento2 {
    private Integer ID_Proyecto;
    private String constructora;
    private String ciudad;
    private Integer estrato;

    public Requerimiento2() {
    }

    public Requerimiento2(Integer id_Proyecto, String constructora, String ciudad, Integer estrato) {
        this.ID_Proyecto = id_Proyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.estrato = estrato;
    }

    
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer Id_Proyecto) {
        this.ID_Proyecto = Id_Proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    
}

