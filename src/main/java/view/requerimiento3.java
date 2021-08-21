package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import controller.ControladorRequerimientosReto4;
import model.vo.Requerimiento3;

public class requerimiento3 extends JFrame{

    public requerimiento3() throws SQLException{

        initUI();
    }

    public void initUI() throws SQLException{
        setLayout(new BorderLayout());

        String[]nombre={"ID_Proyecto","Constructora","Porcentaje_Cuota_Inicial","Acabados"};
        JTable tabla = new JTable(mostrar(),nombre );
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar()throws SQLException{

        ArrayList<Requerimiento3> lista = new ArrayList<Requerimiento3>();
        ControladorRequerimientosReto4 controlador =new ControladorRequerimientosReto4();
        lista = controlador.consultarRequerimiento3();
        String matris[][]= new String [lista.size()][4];
        for(int i = 0; i<lista.size(); i++){
            matris[i][0]=String.valueOf(lista.get(i).getID_Proyecto());
            matris[i][1]=lista.get(i).getConstructora();
            matris[i][2]=String.valueOf(lista.get(i).getPorcentaje_Cuota_Inicial());
            matris[i][3]=lista.get(i).getAcabados();

        }

        return matris;
    }
}
