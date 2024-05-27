package com.cifradocesar.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String text;
		String letters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int alphSize = letters.length();
		
    	String textOrigin = request.getParameter("textOrigin");
    	PrintWriter out = response.getWriter();
    	
    	HttpSession session = request.getSession();
    	RequestDispatcher dispacher = null;
    	
    	//INGRESO EL DICCIONARIO DE FRECUENCIAS WIKI
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("A", 12.53);map.put("B", 1.42);map.put("C", 4.68);
		map.put("D", 5.86);map.put("E", 13.68);map.put("F", 0.69);
		map.put("G", 1.01);map.put("H", 0.70);map.put("I", 6.25);
		map.put("J", 0.44);map.put("K", 0.02);map.put("L", 4.97);
		map.put("M", 3.15);map.put("N", 6.71);map.put("Ñ", 0.31);
		map.put("O", 8.68);map.put("P", 2.51);map.put("Q", 0.88);
		map.put("R", 6.87);map.put("S", 7.98);map.put("T", 4.63);
		map.put("U", 3.93);map.put("V", 0.90);map.put("W", 0.01);
		map.put("X", 0.22);map.put("Y", 0.90);map.put("Z", 0.52);
		double valorMax = -1;
		String key = "";
		//DEL DICCIONARIO OBTENGO EL VALOR CON MAYOR PORCENTAJE
		for (Map.Entry<String, Double> entry : map.entrySet()) {
			final double valorActual = entry.getValue();
			String keyItem = entry.getKey();
			if(valorActual > valorMax) {					
				valorMax = valorActual;
				key = keyItem; 
			}
		}
		map.forEach((keyy, value) -> out.println(keyy + "\t\t" + value + " %"));
		session.setAttribute("dictionary", map);
		session.setAttribute("letterMaxFreq", key);
		session.setAttribute("perMaxFreq", valorMax);
		session.setAttribute("textOrigin", textOrigin);
		dispacher = request.getRequestDispatcher("result.jsp");
		dispacher.forward(request, response);
	}

}
