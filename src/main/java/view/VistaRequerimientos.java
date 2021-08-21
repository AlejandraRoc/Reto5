package view;
 

import controller.ControladorRequerimientosReto4;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextArea;
import java.lang.annotation.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class VistaRequerimientos extends JFrame{
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
  
    private JPanel contentPane;
    private static JTextArea areaDeTexto;
   
    public VistaRequerimientos(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setBounds(450,200,800,600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setBackground(new Color(239,240,242));
        this.setLocationRelativeTo(null);
        contentPane.setLayout(null);
        
        
        JLabel etiqueta = new JLabel("¡Hola! Elige una consulta");
        etiqueta.setFont(new Font("Times new Roman",3,16));
        etiqueta.setForeground(new Color(150,114,165));
        etiqueta.setBounds(100,6,400,30);
        contentPane.add(etiqueta);
        contentPane.setVisible(true);
        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28,70,737,455);
        contentPane.add(scrollPane);
        
        
        areaDeTexto = new JTextArea();
        scrollPane.setViewportView(areaDeTexto);
        
        JButton con1 = new JButton("Consulta 1");
        con1.setBackground(new Color(204,192,216));
        con1.setFont(new Font("Times new Roman", 2,16));
        con1.setForeground(new Color(0,0,0));
        con1.addActionListener(new ActionListener(){
            
            public void actionPerformed (ActionEvent e){
                Requerimiento1();
            }
        });
        con1.setBounds(100,537,117,29);
        con1.setVisible(true);
        contentPane.add(con1);  
        
        JButton con2 = new JButton("Consulta 2"); 
        con2.setBackground(new Color(204,192,216));
        con2.setFont(new Font("Times new Roman", 2,16));
        con2.setForeground(new Color(0,0,0));
        con2.addActionListener(new ActionListener(){
            
            public void actionPerformed (ActionEvent e){
                Requerimiento2();
            }
        });
        con2.setBounds(286,537,117,29);
        con2.setVisible(true);
        contentPane.add(con2);
        
        JButton con3 = new JButton("Consulta 3"); 
        con3.setBackground(new Color(204,192,216));
        con3.setFont(new Font("Times new Roman", 2,16));
        con3.setForeground(new Color(0,0,0));
        con3.addActionListener(new ActionListener(){
            
            public void actionPerformed (ActionEvent e){
                Requerimiento3();
            }
        });
        con3.setBounds(445,537,117,29);
        con3.setVisible(true);
        contentPane.add(con3);
        
        JButton salir = new JButton("Salir");
        salir.setBackground(new Color(204,192,216));
        salir.setFont(new Font("Times new Roman", 2,16));
        salir.setForeground(new Color(0,0,0));
        salir.addActionListener(new ActionListener(){
            
            public void actionPerformed (ActionEvent e){
                System.exit(0);
            }
        });
        salir.setBounds(600,537,117,29);
        salir.setVisible(true);
        contentPane.add(salir);
       
    }
      
       
        public static void Requerimiento1(){
    
            System.out.println("*** Proyectos por estrato ***");

        try{
            
            ArrayList<Requerimiento1> rankingRequerimiento1 = controlador.consultarRequerimiento1();
            String salida = "\n\nID_Tipo\tCodigo_Tipo\tArea_Maxima\tEstrato\n";
            
            for (Requerimiento1 requerimiento1 : rankingRequerimiento1){
                
                salida += requerimiento1.getID_Tipo();
                salida += "\t";
                salida += requerimiento1.getCodigo_Tipo();
                salida += "\t";
                salida += requerimiento1.getArea_Max();
                salida += "\t";
                salida += requerimiento1.getEstrato();
                salida += "\n";
                /*System.out.printf ("El proyecto de ID_Tipo %d de codigo: %d de Area Maxima %d, tiene un estrato %d %n" ,*/
                 
           }
            
            areaDeTexto.setText(salida);
                        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void Requerimiento2(){   
        
        System.out.println("*** Proyectos por Tipo ***");
        
        try{
            
            ArrayList<Requerimiento2> rankingRequerimiento2 = controlador.consultarRequerimiento2();
            String salida = "\n\nID_Proyecto\tConstructora    \t\tCiudad\tEstrato\n";
            
            for (Requerimiento2 requerimiento2 : rankingRequerimiento2){
                
                salida += requerimiento2.getID_Proyecto();
                salida += "\t";
                salida += requerimiento2.getConstructora();
                salida += "\t";
                  if(requerimiento2.getConstructora().length() <= 10){
                    salida += "\t\t";
                   }
                else{
                    salida += "\t";
                }
                salida += requerimiento2.getCiudad();
                salida += "\t";
                salida += requerimiento2.getEstrato();
                salida += "\n";
                /*System.out.printf ("El proyecto de ID_Tipo %d de codigo: %d de Area Maxima %d, tiene un estrato %d %n" ,*/
                 
           }
            
            areaDeTexto.setText(salida);
        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void Requerimiento3(){

        System.out.println(" *** Proyectos de Tipo Apartaestudio en Quibdo ***");

         try{
            
            ArrayList<Requerimiento3> rankingRequerimiento3 = controlador.consultarRequerimiento3();
            String salida = "\n\nID_Proyecto\tConstructora\t\tPorcentaje_Cuota_Inicial\tAcabados\n";
            
            for (Requerimiento3 requerimiento3 : rankingRequerimiento3){
                
                salida += requerimiento3.getID_Proyecto();
                salida += "\t";
                salida += requerimiento3.getConstructora();
                salida += "\t";
                 if(requerimiento3.getConstructora().length() <= 15){
                    salida += "\t\t";
                   }
                else{
                    salida += "\t";
                }
                salida += requerimiento3.getPorcentaje_Cuota_Inicial();
                salida += "\t";
                salida += requerimiento3.getAcabados();
                salida += "\n";
                /*System.out.printf ("El proyecto de ID_Tipo %d de codigo: %d de Area Maxima %d, tiene un estrato %d %n" ,*/
                 
           }
            
            areaDeTexto.setText(salida);
                        
                
        }catch(SQLException e){
            System.err.println("Se encontró un error!"+e.getMessage());
        }
    }

}

