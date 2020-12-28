package ventanas;

import clases.Partida;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author F. Pino
 */
public class Ventana1_FXMLController implements Initializable {
    
    final ArrayList<Partida> partidas = new ArrayList<>();
    private Partida partidaGuia;
    private boolean generandoPuntajes=true;
    
    @FXML
    private Label label;    
    @FXML
    private Button b0;    
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;     
    @FXML
    private Button b8;
    
    @FXML
    private void boton_0(ActionEvent event) {
        this.seleccionar0("o");
        this.seleccionIA();
        label.setText("0");
    }
    
    @FXML
    private void boton_1(ActionEvent event) {
        this.seleccionar1("o");
        this.seleccionIA();
        label.setText("1");
    }
    
    @FXML
    private void boton_2(ActionEvent event) {
        this.seleccionar2("o");
        this.seleccionIA();
        label.setText("2");
    }
    
    @FXML
    private void boton_3(ActionEvent event) {
        this.seleccionar3("o");
        this.seleccionIA();
        label.setText("3");
    }
    
    @FXML
    private void boton_4(ActionEvent event) {
        this.seleccionar4("o");
        this.seleccionIA();
        label.setText("4");
    }
    
    @FXML
    private void boton_5(ActionEvent event) {
        this.seleccionar5("o");
        this.seleccionIA();
        label.setText("5");
    }
    
    @FXML
    private void boton_6(ActionEvent event) {
        this.seleccionar6("o");
        this.seleccionIA();
        label.setText("6");
    }
    
    @FXML
    private void boton_7(ActionEvent event) {
        this.seleccionar7("o");
        this.seleccionIA();
        label.setText("7");
    }
    
    @FXML
    private void boton_8(ActionEvent event) {
        this.seleccionar8("o");
        this.seleccionIA();
        label.setText("8");
    }
    
    @FXML
    private void boton_reiniciar(ActionEvent event) {
        this.borrarTablero();     
        this.seleccionIA();
    }
    
    private boolean seleccionar0(String simbolo){
        if(!this.b0.isDisable()){
            this.b0.setText(simbolo);
            this.b0.setDisable(true);          
            return true;
        }
        return false;
    }
    
    private boolean seleccionar1(String simbolo){
        if(!this.b1.isDisable()){
            this.b1.setText(simbolo);
            this.b1.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar2(String simbolo){
        if(!this.b2.isDisable()){
            this.b2.setText(simbolo);
            this.b2.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar3(String simbolo){
        if(!this.b3.isDisable()){
            this.b3.setText(simbolo);
            this.b3.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar4(String simbolo){
        if(!this.b4.isDisable()){
            this.b4.setText(simbolo);
            this.b4.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar5(String simbolo){
        if(!this.b5.isDisable()){
            this.b5.setText(simbolo);
            this.b5.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar6(String simbolo){
        if(!this.b6.isDisable()){
            this.b6.setText(simbolo);
            this.b6.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar7(String simbolo){
        if(!this.b7.isDisable()){
            this.b7.setText(simbolo);
            this.b7.setDisable(true);
            return true;
        }
        return false;
    }
    
    private boolean seleccionar8(String simbolo){
        if(!this.b8.isDisable()){
            this.b8.setText(simbolo);
            this.b8.setDisable(true);            
            return true;
        }
        return false;
    }
    
    private int seleccionarRandom(){
        
        int[] posibles = new int[9];      
        int i=0;
        
        if(!this.b0.isDisable())
        {
            posibles[i]=0;
            i++;
        }
        if(!this.b1.isDisable())
        {
            posibles[i]=1;
            i++;
        }
        if(!this.b2.isDisable())
        {
            posibles[i]=2;
            i++;
        }
        if(!this.b3.isDisable())
        {
            posibles[i]=3;
            i++;
        }
        if(!this.b4.isDisable())
        {
            posibles[i]=4;
            i++;
        }
        if(!this.b5.isDisable())
        {
            posibles[i]=5;
            i++;
        }
        if(!this.b6.isDisable())
        {
            posibles[i]=6;
            i++;
        }
        if(!this.b7.isDisable())
        {
            posibles[i]=7;
            i++;
        }
        if(!this.b8.isDisable())
        {
            posibles[i]=8;
            i++;
        }            
        return posibles[new Random().nextInt(i)];            
    }
    
    private void seleccionIARandom(){  
        switch(seleccionarRandom()){
            case 0:{               
                this.seleccionar0("o");
                break;
            }
            case 1:{
                this.seleccionar1("o");                   
                break;
            }
            case 2:{
                this.seleccionar2("o");               
                break;
            }
            case 3:{
                this.seleccionar3("o");                
                break;
            }
            case 4:{
               this.seleccionar4("o");                  
               break;
            }
            case 5:{
                this.seleccionar5("o");                
                break;
            }
            case 6:{
                this.seleccionar6("o");                    
                break;
            }
            case 7:{
                this.seleccionar7("o");                
                break;
            }
            case 8:{
                this.seleccionar8("o");               
            }
        }
        
    }
    
    private void seleccionIA()
    {      
        Partida bestBet = null;
        ArrayList<Partida> posibles = new ArrayList<>();
        for (int i = 0; i < this.partidas.size(); i++) {
            if(esEstadoIgual(partidas.get(i)))
            {
                posibles.add(partidas.get(i));
                if (bestBet == null) {
                    bestBet=partidas.get(i);
                }
                else
                {
                    if (bestBet.getPuntaje()<partidas.get(i).getPuntaje()) {
                        bestBet=partidas.get(i);
                    }
                }
            }
        }
        if (bestBet==null) {
         //   System.out.println("Derrota / Empate");
        }
        else
        {
            if (generandoPuntajes) {
                bestBet=partidas.get(new Random().nextInt(partidas.size()-1));
            }
            avanzarEstado(bestBet);
            this.partidaGuia=bestBet;
        }
            
            
    }
    
    private boolean esEstadoIgual(Partida partida)
    {
        //System.out.println(this.b0.getText()+" "+partida.getN0());
        if (!partida.isEsGanador()) {
            return false;
        }
        if (!this.b0.getText().equals(partida.getN0()) && !this.b0.getText().equals("")) {           
            return false;
        }
        if (!this.b1.getText().equals(partida.getN1()) && !this.b1.getText().equals("")) {
            return false;
        }
        if (!this.b2.getText().equals(partida.getN2()) && !this.b2.getText().equals("")) {
            return false;
        }
        if (!this.b3.getText().equals(partida.getN3()) && !this.b3.getText().equals("")) {
            return false;
        }
        if (!this.b4.getText().equals(partida.getN4()) && !this.b4.getText().equals("")) {
            return false;
        }
        if (!this.b5.getText().equals(partida.getN5()) && !this.b5.getText().equals("")) {
            return false;
        }
        if (!this.b6.getText().equals(partida.getN6()) && !this.b6.getText().equals("")) {
            return false;
        }
        if (!this.b7.getText().equals(partida.getN7()) && !this.b7.getText().equals("")) {
            return false;
        }
        if (!this.b8.getText().equals(partida.getN8()) && !this.b8.getText().equals("")) {
            return false;
        }
        return true;        
    }
    
    private void avanzarEstado(Partida partida)
    {
        if (partida.getN0().equals("x") && this.b0.getText().equals("")) {
            this.seleccionar0("x");
            return;
        }
        if (partida.getN1().equals("x") && this.b1.getText().equals("")) {
            this.seleccionar1("x");
            return;
        }
        if (partida.getN2().equals("x") && this.b2.getText().equals("")) {
            this.seleccionar2("x");
            return;
        }
        if (partida.getN3().equals("x") && this.b3.getText().equals("")) {
            this.seleccionar3("x");
            return;
        }
        if (partida.getN4().equals("x") && this.b4.getText().equals("")) {
            this.seleccionar4("x");
            return;
        }
        if (partida.getN5().equals("x") && this.b5.getText().equals("")) {
            this.seleccionar5("x");
            return;
        }
        if (partida.getN6().equals("x") && this.b6.getText().equals("")) {
            this.seleccionar6("x");
            return;
        }
        if (partida.getN7().equals("x") && this.b7.getText().equals("")) {
            this.seleccionar7("x");
            return;
        }
        if (partida.getN8().equals("x") && this.b8.getText().equals("")) {
            this.seleccionar8("x");
            return;
        }
    }
    
    private void borrarTablero() {       
        this.b0.setText("");
        this.b0.setDisable(false);
        this.b1.setText("");
        this.b1.setDisable(false);
        this.b2.setText("");
        this.b2.setDisable(false);
        this.b3.setText("");
        this.b3.setDisable(false);
        this.b4.setText("");
        this.b4.setDisable(false);
        this.b5.setText("");
        this.b5.setDisable(false);
        this.b6.setText("");
        this.b6.setDisable(false);
        this.b7.setText("");
        this.b7.setDisable(false);
        this.b8.setText("");
        this.b8.setDisable(false);      
    }
    
    private void generarPuntajes()  //Generate points
    {
        
        int estadoTablero;
        for (int i = 0; i < 100000; i++) {
            int puntaje = 9;
            do
            {
                this.seleccionIA();
                estadoTablero=verificarFinJuego();  //// 0 = victory, 1 = lost/tie, 2 = keeps playing
                if (estadoTablero==0) {
                    partidaGuia.setPuntaje(partidaGuia.getPuntaje()+puntaje);   //Sets points to winning solution
                  //  System.out.println("victoria: "+partidaGuia.getPuntaje());
                }
                else if (estadoTablero==2) {
                    this.seleccionIARandom();     //Selects random rival
                }
                
                puntaje--;     
            }while(estadoTablero==2);
            borrarTablero();                     //Restart table
                   
        }
    }
    
    private boolean tableroCompletado()
    {
        if(!this.b0.getText().equals("") && !this.b1.getText().equals("") && !this.b2.getText().equals("") && !this.b3.getText().equals("") && !this.b4.getText().equals("") && !this.b5.getText().equals("") && !this.b6.getText().equals("") && !this.b7.getText().equals("") && !this.b8.getText().equals(""))
        {
            return true;
        }
        return false;
    }
    
    private int verificarFinJuego()
    {
        // 0 = victoria, 1 = derrota/empate, 2 = sigue el juego
        if(this.b0.getText().equals("x") && this.b1.getText().equals("x") && this.b2.getText().equals("x"))
        {
            return 0;
        }
        if(this.b3.getText().equals("x") && this.b4.getText().equals("x") && this.b5.getText().equals("x"))
        {
            return 0;
        }
        if(this.b6.getText().equals("x") && this.b7.getText().equals("x") && this.b8.getText().equals("x"))
        {
            return 0;
        }
        if(this.b0.getText().equals("x") && this.b3.getText().equals("x") && this.b6.getText().equals("x"))
        {
            return 0;
        }
        if(this.b1.getText().equals("x") && this.b4.getText().equals("x") && this.b7.getText().equals("x"))
        {
            return 0;
        }
        if(this.b2.getText().equals("x") && this.b5.getText().equals("x") && this.b8.getText().equals("x"))
        {
            return 0;
        }
        if(this.b0.getText().equals("x") && this.b4.getText().equals("x") && this.b8.getText().equals("x"))
        {
            return 0;
        }
        if(this.b6.getText().equals("x") && this.b4.getText().equals("x") && this.b2.getText().equals("x"))
        {
            return 0;
        }
        
        if (tableroCompletado()) {
            return 1;
        }
        
        if(this.b0.getText().equals("o") && this.b1.getText().equals("o") && this.b2.getText().equals("o"))
        {
            return 1;
        }
        if(this.b3.getText().equals("o") && this.b4.getText().equals("o") && this.b5.getText().equals("o"))
        {
            return 1;
        }
        if(this.b6.getText().equals("o") && this.b7.getText().equals("o") && this.b8.getText().equals("o"))
        {
            return 1;
        }
        if(this.b0.getText().equals("o") && this.b3.getText().equals("o") && this.b6.getText().equals("o"))
        {
            return 1;
        }
        if(this.b1.getText().equals("o") && this.b4.getText().equals("o") && this.b7.getText().equals("o"))
        {
            return 1;
        }
        if(this.b2.getText().equals("o") && this.b5.getText().equals("o") && this.b8.getText().equals("o"))
        {
            return 1;
        }
        if(this.b0.getText().equals("o") && this.b4.getText().equals("o") && this.b8.getText().equals("o"))
        {
            return 1;
        }
        if(this.b6.getText().equals("o") && this.b4.getText().equals("o") && this.b2.getText().equals("o"))
        {
            return 1;
        }
        
        
        return 2;
        
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.borrarTablero();
        
        try {
            File archivo = new File ("src/datos/database.data");
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String lineaTemporal;
            while((lineaTemporal = bufferReader.readLine())!=null){
                String [] segmentado = lineaTemporal.split(",");
                this.partidas.add(new Partida(segmentado[0],segmentado[1],
                        segmentado[2],segmentado[3],segmentado[4],
                        segmentado[5],segmentado[6],segmentado[7],
                        segmentado[8],segmentado[9]));
            }
            
            fileReader.close();
        } catch (IOException ex) {
            System.out.println("¡ No Existen Datos !");
        }       
        System.out.println("Generando puntajes, por favor espere");
        this.generarPuntajes();
        System.out.println("Putajes Generados");
        this.generandoPuntajes=false;
        this.borrarTablero();
        for (int i = 0; i < partidas.size(); i++) {
            //System.out.println(partidas.get(i).getPuntaje());
        }
        this.seleccionIA();
    }    
    
}
