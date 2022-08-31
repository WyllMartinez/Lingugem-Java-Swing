/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ambientesvisuais.unipar.br;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



/**
 *
 * @author wyllm
 */
public class Calculadora extends JFrame{
    
 
    private int leitura;
   
  
    public Calculadora (){
        
        
        
        
        JTextField panel = new JTextField();
        panel.setBounds(5, 5, 275, 150);
        panel.setVisible(true);
        panel.setBackground(Color.WHITE);
        panel.setFont(new Font("Arial", 0, 50));
        panel.setHorizontalAlignment(panel.RIGHT);
       
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JButton botao = new JButton(" x");
        botao.setBounds(5, 160, 65, 65);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
         
                panel.setText(panel.getText()+"x");
            }
        });
        
        JButton botao1 = new JButton(" 7 ");
        botao1.setBounds(5, 230, 65, 65);
        
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 7;
               
              
                panel.setText(panel.getText()+7);
            }
        });
        
        
        JButton botao2 = new JButton(" 4 ");
        botao2.setBounds(5, 300, 65, 65);
        
        
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 4;
            
                panel.setText(panel.getText()+4);
            }
        });
        
        JButton botao3 = new JButton(" 1 ");
        botao3.setBounds(5, 370, 65, 65);
        
            botao3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 1;
              
                panel.setText(panel.getText()+1);
            }
            });
        JButton botao4 = new JButton(",");
        botao4.setBounds(5, 440, 65, 65);
        
        botao4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                panel.setText(panel.getText()+",");
            }
        });
        
        JButton botao5 = new JButton(" / ");
        botao5.setBounds(75, 160, 65, 65);
        
        botao5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
       
                panel.setText(panel.getText()+'/');
    
            }
        });
        
        JButton botao6 = new JButton(" 8 ");
        botao6.setBounds(75, 230, 65, 65);
        
        
            botao6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 8;
                
                panel.setText(panel.getText()+"8");
            }
            });
        
        JButton botao7 = new JButton(" 5 ");
        botao7.setBounds(75, 300, 65, 65);
        
            botao7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 5;
                
                panel.setText(panel.getText()+"5");
            }
            });
        
        JButton botao8 = new JButton(" 2 ");
        botao8.setBounds(75, 370, 65, 65);
        
        botao8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               leitura += 2;
               
                panel.setText(panel.getText()+"2");
            }
        });
        
        
        JButton botao9 = new JButton(" 0 ");
        botao9.setBounds(75, 440, 65, 65);
        
        
        botao9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 0;
               
                panel.setText(panel.getText()+"0");
            }
        });
        
      
        JButton botao10 = new JButton(" - ");
        botao10.setBounds(145, 160, 65, 65);
        
        botao10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               
                panel.setText(panel.getText()+"-");
                
            }
        });
        
        JButton botao11 = new JButton(" 9 ");
        botao11.setBounds(145, 230, 65, 65);
        
        botao11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 9;
               
                panel.setText(panel.getText()+"9");
            }
        });
        
        JButton botao12 = new JButton(" 6 ");
        botao12.setBounds(145, 300, 65, 65);
        
        botao12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 6;
               
               
                
                panel.setText(panel.getText()+"6");
            }
        });
        
        JButton botao13 = new JButton(" 3 ");
        botao13.setBounds(145, 370, 65, 65);
        
        
        botao13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 3;
             
               
                
                panel.setText(panel.getText()+"3");
            }
        });
        
        JButton botao14 = new JButton("  ");
        botao14.setBounds(145, 440, 65, 65);
        
        
        JButton botao15 = new JButton(" + ");
        botao15.setBounds(215, 160, 65, 65);
        botao15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            
                panel.setText(panel.getText()+"+");

            }
        });
        
       
       
        
        JButton botao16 = new JButton(" CE ");
        botao16.setBounds(215, 230, 65, 65);
        botao16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura = 0;
              
                panel.setText("");
            }
        });
       
       
        JButton botao18 = new JButton("  ");
        botao18.setBounds(215, 370, 65, 65);
            
        
        
        
        JButton botao17 = new JButton(" = ");
        botao17.setBounds(215, 300, 65, 65);
        
        
        
       
        
       
            
        
        
        JButton botao19 = new JButton("Sair");
        botao19.setBounds(215, 440, 65, 65);
        
        botao19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora.this.dispose();
            }  
        });
        
        
        
        
        
        
        add(panel);
        add(botao);
        add(botao1);
        add(botao2);
        add(botao3);
        add(botao4);
        add(botao5);
        add(botao6);
        add(botao7);
        add(botao8);
        add(botao9);
        add(botao10);
        add(botao11);
        add(botao12);
        add(botao13);
        add(botao14);
        add(botao15);
        add(botao16);
        add(botao17);
        add(botao18);
        add(botao19);
        
        setLayout(null);
        setSize(299, 547);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Calculadora();
        
    }
        
    }

    
    
    
   
    
    
    
 
        
    
    
    
    

