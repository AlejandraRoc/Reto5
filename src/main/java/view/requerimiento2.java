package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import controller.ControladorRequerimientosReto4;
import model.vo.Requerimiento2;

public class requerimiento2 extends JFrame{

    public requerimiento2() throws SQLException{

        initUI();
    }

    public void initUI() throws SQLException{
        setLayout(new BorderLayout());

        String[]nombre={"ID_Proyecto","Constructora","Ciudad","Estrato"};
        JTable tabla = new JTable(mostrar(),nombre );
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar()throws SQLException{

        ArrayList<Requerimiento2> lista = new ArrayList<Requerimiento2>();
        ControladorRequerimientosReto4 controlador =new ControladorRequerimientosReto4();
        lista = controlador.consultarRequerimiento2();
        String matris[][]= new String [lista.size()][4];
        for(int i = 0; i<lista.size(); i++){
            matris[i][0]=String.valueOf(lista.get(i).getID_Proyecto());
            matris[i][1]=lista.get(i).getConstructora();
            matris[i][2]=lista.get(i).getCiudad();
            matris[i][3]=String.valueOf(lista.get(i).getEstrato());

        }

        return matris;
    }
}
