package subtitulos;

import de.humatic.dsj.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;   
import javax.media.*; 
import java.awt.*;   
import java.io.*; 
import java.util.*;
/* incorporar los paquetes que genera sablecc
   subtitulos puede ser reemplazado por el nombre que usted utiliza
import subtitulos.analysis.*;
import subtitulos.node.*;
import subtitulos.parser.*;
import subtitulos.lexer.*;
*/

public class PlayMovie implements java.beans.PropertyChangeListener {
  
  private DSFiltergraph movie;
  private JavaOverlayFilter jof;
  private java.awt.Graphics2D g2d;
  private Vector subtitulos;  
  private String texto_subtitulo = "Fundamentos de Ciencias de la Computacion";
  
  public PlayMovie() {
    
  }
  
  public void createGraph() {
    //reemplazar esta instruccion por su propio codigo de desbloqueo
    //DSEnvironment.unlockDLL("lgajardo@ubiobio.cl", 755802, 2966957, 0);
    DSEnvironment.unlockDLL("non@commercial.dsj", 75720, 1309601, 0);
    javax.swing.JFrame f = new javax.swing.JFrame("dsj - play movie");
    java.awt.FileDialog fd = new java.awt.FileDialog(f, "select movie", java.awt.FileDialog.LOAD);
    fd.setVisible(true);
    if (fd.getFile() == null) 
      return;
    movie = new DSMovie(fd.getDirectory()+fd.getFile(), DSFiltergraph.DD7, this);
    f.getContentPane().add(java.awt.BorderLayout.CENTER, movie.asComponent());
    f.getContentPane().add(java.awt.BorderLayout.SOUTH, new SwingMovieController(movie));
    f.pack();
    f.setVisible(true);
    
    jof = movie.insertOverlayFilter(JavaOverlayFilter.CALLBACK);
    g2d = jof.getDrawingSurface();
    jof.setKeyColor(java.awt.Color.blue);
    g2d.setFont(new java.awt.Font("Arial", 1, 18));
    
    /**********************************************************************
    Crear aqui el arbol de derivacion
    */
    
    //Ejemplo que indica como programar el timer
    String timeio = "00:00:24,641 --> 00:00:27,031";
    
    int hrsI = Integer.parseInt(timeio.substring(0,2));
    int mntosI = Integer.parseInt(timeio.substring(3,5));
    int sgdosI = Integer.parseInt(timeio.substring(6,8));
    int milsI = Integer.parseInt(timeio.substring(9,12));
       
    int hrsO = Integer.parseInt(timeio.substring(17,19));
    int mntosO = Integer.parseInt(timeio.substring(20,22));
    int sgdosO = Integer.parseInt(timeio.substring(23,25));
    int milsO = Integer.parseInt(timeio.substring(26,29));
       
    long tiempoEntrada =(long)(milsI + sgdosI*1000 + mntosI*60000 + hrsI*3600000);
    long tiempoSalida =(long)(milsO + sgdosO*1000 + mntosO*60000 + hrsO*3600000);
    
    new Reminder(tiempoEntrada, "Tarea 1 - Uso de gramaticas - aplicacion practica"); //muestra el texto
    new Reminder(tiempoSalida, ""); //borra el texto
    
    /**
    Don't do this at home. This demo relies on dsj closing and disposing off filtergraphs when the JVM exits. This is
    OK for a "open graph, do something & exit" style demo, but real world applications should take care of calling
    dispose() on filtergraphs they're done with themselves.
    **/
    f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  }
  
  
  public void propertyChange(java.beans.PropertyChangeEvent pe) {
    //System.out.println("received event or callback from "+pe.getPropagationId());
    switch(DSJUtils.getEventType(pe)) {
    }
    
    try {
      /** escritura de subtitulo sobre el video **/
      g2d.clearRect( 0, 0, (int)(movie.getMediaDimension().getWidth()), (int)(movie.getMediaDimension().getHeight()));
      g2d.setColor(java.awt.Color.white);
      g2d.drawString(texto_subtitulo, 20, (int)(movie.getMediaDimension().getHeight())-10);
      
      try {
        jof.submitFrame();
      } 
      catch (Exception e) {
        g2d = jof.getDrawingSurface();
        System.out.println(e.toString());
      } 
      
      /** g2d may be null on first call **/
    } catch (NullPointerException npe){}
  }
  
  public static void main(String[] args){
    new PlayMovie().createGraph();
  }
  
  public class Reminder {
    Timer timer;
    String texto;
    String color;
    Font f;
    
    public Reminder(long seconds, String texto) {
      this.texto = texto;
      timer = new Timer();
      timer.schedule(new RemindTask(), seconds); //5000 milisegundos = 5 segundos
    }
    
    class RemindTask extends TimerTask {
      public void run() { //se ejecuta solo cuando se cumple el tiempo y de manera simultanea al video           
        texto_subtitulo = texto;
        System.out.println(texto);        
      }
    }  
  }
}