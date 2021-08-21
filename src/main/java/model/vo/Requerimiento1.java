package model.vo;

public class Requerimiento1 {
    
    private Integer ID_Tipo;
    private Integer Codigo_Tipo;
    private Integer Area_Max;
    private Integer Financiable;
    private Integer Estrato;

        public Requerimiento1() {
        }
    
        public Requerimiento1(Integer ID_Tipo, Integer Codigo_Tipo, Integer Area_Max, Integer Financiable, Integer Estrato){
            this.ID_Tipo = ID_Tipo;
            this.Codigo_Tipo = Codigo_Tipo;
            this.Area_Max = Area_Max;
            this.Financiable = Financiable;
            this.Estrato = Estrato;
        }
    
        public Integer getID_Tipo() {
            return ID_Tipo;
        }
    
        public void setID_Tipo(Integer iD_Tipo) {
            this.ID_Tipo = iD_Tipo;
        }
        public Integer getCodigo_Tipo() {
            return Codigo_Tipo;
        }
        public void setCodigo_Tipo(Integer codigo_Tipo) {
            this.Codigo_Tipo = codigo_Tipo;
        }
        public Integer getArea_Max() {
            return Area_Max;
        }
        public void setArea_Max(Integer area_Max) {
            this.Area_Max = area_Max;
        }
        public Integer getFinanciable() {
            return Financiable;
        }
        public void setFinanciable(Integer financiable) {
           this.Financiable = financiable;
        }
        public Integer getEstrato() {
            return Estrato;
        }
        public void setEstrato(Integer estrato) {
            this.Estrato = estrato;
        }
    }   
