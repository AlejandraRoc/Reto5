package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing. *;
import javax.swing.event. *;
import java.awt. *;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.*;


import controller.ControladorRequerimientosReto4;
import model.vo.Requerimiento1;

public class requerimiento1 extends JFrame  {
    
    
    public requerimiento1() throws SQLException {
        initUI();
              
    }
    
    public void initUI() throws SQLException{
        
        setLayout(new BorderLayout());
        
        String[]nombre={"ID_Tipo","Codigo_Tipo","Area_Max","Estrato"};
        JTable tabla = new JTable(mostrar(),nombre);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    public String[][] mostrar() throws SQLException{
        
        ArrayList<Requerimiento1> lista = new ArrayList<Requerimiento1>();
        ControladorRequerimientosReto4 controlador =new ControladorRequerimientosReto4();
        lista = controlador.consultarRequerimiento1();
        String matris[][]= new String [lista.size()][4];
        for(int i = 0; i<lista.size(); i++){
            matris[i][0]=String.valueOf(lista.get(i).getID_Tipo());
            matris[i][1]=String.valueOf(lista.get(i).getCodigo_Tipo());
            matris[i][2]=String.valueOf(lista.get(i).getArea_Max());
            matris[i][3]=String.valueOf(lista.get(i).getEstrato());
        }
        
        return matris;
    }
        
}
