package Calculadora;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora {
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame{	
	public Ventana() {
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image icono = pantalla.getImage("Calculadora.png");
		
		setTitle("Calculadora");
		setSize(270,500);
		setLocationRelativeTo(null);
		setIconImage(icono);
		setVisible(true);
				
		add(new Botones());
	}
}

class Botones extends JPanel implements ActionListener{
	JButton botonC,botonCero,botonIgual,botonMas,botonUno
	,botonDos,botonTres,botonMenos,botonCuatro,botonCinco,
	botonSeis,botonMul,botonSiete,botonOcho,botonNueve,botonDiv,
	botonPantalla,botonHistoria;
	
	
	public Botones() {
		
		setLayout(null);
		setBackground(new Color(135,204,254));
		
		botonC = new JButton("C");
		botonC.setBounds(10, 390, 50, 50);
		botonC.setFont(new Font("arial",Font.BOLD,20));
		botonC.setBackground(new Color(236,226,182));
		add(botonC);
		botonC.addActionListener(this);
		
		botonCero = new JButton("0");
		botonCero.setBounds(70, 390, 50, 50);
		botonCero.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonCero.setBackground(new Color(211,254,135));
		add(botonCero);
		botonCero.addActionListener(this);
		
		botonIgual = new JButton("=");
		botonIgual.setBounds(130, 390, 50, 50);
		botonIgual.setFont(new Font("arial",Font.BOLD,20));
		botonIgual.setBackground(new Color(236,226,182));
		add(botonIgual);
		botonIgual.addActionListener(this);
		
		botonMas = new JButton("+");
		botonMas.setBounds(190, 390, 50, 50);
		botonMas.setFont(new Font("arial",Font.BOLD,20));
		botonMas.setBackground(new Color(236,226,182));
		add(botonMas);
		botonMas.addActionListener(this);
		
		botonUno = new JButton("1");
		botonUno.setBounds(10, 330, 50, 50);
		botonUno.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonUno.setBackground(new Color(211,254,135));
		add(botonUno);
		botonUno.addActionListener(this);
		
		botonDos = new JButton("2");
		botonDos.setBounds(70, 330, 50, 50);
		botonDos.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonDos.setBackground(new Color(211,254,135));
		add(botonDos);
		botonDos.addActionListener(this);
		
		botonTres = new JButton("3");
		botonTres.setBounds(130, 330, 50, 50);
		botonTres.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonTres.setBackground(new Color(211,254,135));
		add(botonTres);
		botonTres.addActionListener(this);
		
		botonMenos = new JButton("-");
		botonMenos.setBounds(190, 330, 50, 50);
		botonMenos.setFont(new Font("arial",Font.BOLD,20));
		botonMenos.setBackground(new Color(236,226,182));
		add(botonMenos);
		botonMenos.addActionListener(this);
		
		botonCuatro = new JButton("4");
		botonCuatro.setBounds(10, 270, 50, 50);
		botonCuatro.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonCuatro.setBackground(new Color(211,254,135));
		add(botonCuatro);
		botonCuatro.addActionListener(this);
		
		botonCinco = new JButton("5");
		botonCinco.setBounds(70, 270, 50, 50);
		botonCinco.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonCinco.setBackground(new Color(211,254,135));
		add(botonCinco);
		botonCinco.addActionListener(this);
		
		botonSeis = new JButton("6");
		botonSeis.setBounds(130, 270, 50, 50);
		botonSeis.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonSeis.setBackground(new Color(211,254,135));
		add(botonSeis);
		botonSeis.addActionListener(this);
		
		botonMul = new JButton("*");
		botonMul.setBounds(190, 270, 50, 50);
		botonMul.setFont(new Font("arial",Font.BOLD,20));
		botonMul.setBackground(new Color(236,226,182));
		add(botonMul);
		botonMul.addActionListener(this);
		
		botonSiete = new JButton("7");
		botonSiete.setBounds(10, 210, 50, 50);
		botonSiete.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonSiete.setBackground(new Color(211,254,135));
		add(botonSiete);
		botonSiete.addActionListener(this);
		
		botonOcho = new JButton("8");
		botonOcho.setBounds(70, 210, 50, 50);
		botonOcho.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonOcho.setBackground(new Color(211,254,135));
		add(botonOcho);
		botonOcho.addActionListener(this);
		
		botonNueve = new JButton("9");
		botonNueve.setBounds(130, 210, 50, 50);
		botonNueve.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		botonNueve.setBackground(new Color(211,254,135));
		add(botonNueve);
		botonNueve.addActionListener(this);
		
		botonDiv = new JButton("/");
		botonDiv.setBounds(190, 210, 50, 50);
		botonDiv.setFont(new Font("arial",Font.BOLD,20));
		botonDiv.setBackground(new Color(236,226,182));
		add(botonDiv);
		botonDiv.addActionListener(this);
		
		botonPantalla = new JButton();
		botonPantalla.setBounds(10, 10, 230, 100);
		botonPantalla.setFont(new Font("arial",Font.BOLD,20));
		botonPantalla.setEnabled(false);
		add(botonPantalla);
		
		botonHistoria = new JButton();
		botonHistoria.setBounds(10, 130, 230, 50);
		botonHistoria.setFont(new Font("arial",Font.BOLD,20));
		botonHistoria.setEnabled(false);
		add(botonHistoria);
	}
		

	public void actionPerformed(ActionEvent e) {
		String entrada = e.getActionCommand();		
	    botonHistoria.setText(botonHistoria.getText()+entrada);
	    
		if(entrada.equals("=")) {
			String op = buscarSigno(botonHistoria.getText()); 					
			String res;
			int num1;
			int indice;
			int num2;
			if(op.equals("+")) {
				num1 = recogerNumeroUno(botonHistoria.getText())[0];
				indice = recogerNumeroUno(botonHistoria.getText())[1];
				num2 = recogerNumeroDos(botonHistoria.getText(),indice);
				res = suma(num1,num2);
				botonPantalla.setText(res);
				botonHistoria.setText("");
			}else if(op.equals("-")) {
				num1 = recogerNumeroUno(botonHistoria.getText())[0];
				indice = recogerNumeroUno(botonHistoria.getText())[1];
				num2 = recogerNumeroDos(botonHistoria.getText(),indice);
				res = resta(num1,num2);
				botonPantalla.setText(res);
				botonHistoria.setText("");
			}else if(op.equals("*")) {
				num1 = recogerNumeroUno(botonHistoria.getText())[0];
				indice = recogerNumeroUno(botonHistoria.getText())[1];
				num2 = recogerNumeroDos(botonHistoria.getText(),indice);
				res = multiplicacion(num1,num2);
				botonPantalla.setText(res);
				botonHistoria.setText("");
			}else if(op.equals("/")) {
				num1 = recogerNumeroUno(botonHistoria.getText())[0];
				indice = recogerNumeroUno(botonHistoria.getText())[1];
				num2 = recogerNumeroDos(botonHistoria.getText(),indice);
				res = division(num1,num2);
				botonPantalla.setText(res);
				botonHistoria.setText("");
			}
		}else if(entrada.equals("C")) {
			botonHistoria.setText("");
		}
			
	}
	
	//Metodo para sumar
	private String suma(int numeroUno , int numeroDos) {
		int sum;
		String resultado;
		
		sum = numeroUno+numeroDos;
		
		resultado = Integer.toString(sum);
		return resultado;
	}
	
	//Metodo para restar
	private String resta(int numeroUno , int numeroDos) {
		int res;
		String resultado;
		
		res = numeroUno-numeroDos;
		
		resultado = Integer.toString(res);
		return resultado;
	}
	
	//Metodo para multiplicar
	private String multiplicacion(int numeroUno ,int numeroDos) {
		int mul;
		String resultado;
		
		mul = numeroUno*numeroDos;
		resultado = Integer.toString(mul);
		return resultado;
	}
	
	//Metodo para dividir
	private String division(int numeroUno,int numeroDos) {
		int div;
		String resultado;
		
		if(numeroDos==0) {
			resultado = "No se puede dividir...";
		}else {
			div = numeroUno/numeroDos;
			resultado = Integer.toString(div);
		}
		
		return resultado;
	}
	
	//metodo para obtener el primer valor
	private int[] recogerNumeroUno(String uno) {
		String cadena = uno;
		String nuevoNumero = "";;
		int i;
		
		for(i=0;i<cadena.length();i++) {				
			if(cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/') {
				break;
			}
			nuevoNumero += cadena.charAt(i);
		}
		int [] resultado = {Integer.parseInt(nuevoNumero),i};
		return resultado;
	}
	
	//Metodo para obtener el segundo valor
	private int recogerNumeroDos(String dos,int num1) {
		String cadena = dos;
		int indice = num1;
		String nuevoNumero = "";
		int resultado;
		
		for(int i=indice+1;i<cadena.length();i++) {
			if(cadena.charAt(i) == '=') {
				break;
			}
				nuevoNumero += cadena.charAt(i);	
		}
		
		resultado = Integer.parseInt(nuevoNumero);
		return resultado;
	}
	
	//Metodo para obtener el signo
	private String buscarSigno(String dato) {
		String res = dato;
		String devuelto = "";
		
		for(int i=0;i<res.length();i++) {
			if(res.charAt(i) == '+') {
				devuelto = "+";
				break;
			}else if(res.charAt(i) == '-') {
				devuelto = "-";
				break;
			}else if(res.charAt(i) == '*') {
				devuelto = "*";
				break;
			}else if(res.charAt(i) == '/') {
				devuelto = "/";
				break;
			}
		}
		return devuelto;
	}
}










