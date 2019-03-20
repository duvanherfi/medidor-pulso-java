/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import javax.swing.JOptionPane;
import jssc.SerialPortException;

/**
 *
 * @author duvan
 */
public class HiloPuertos extends Thread {

    private PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();

    public HiloPuertos() {
        super("comprobacion");

    }

    @Override
    public void run() {
        boolean h = false;
        try {

            Arduino.killArduinoConnection();
        } catch (ArduinoException ex) {

        }
        while (true) {
            if (!h) {
                for (int i = 0; i < Arduino.getSerialPorts().size(); i++) {
                    if ((Arduino.getSerialPorts().size() < 1) || (Arduino.getSerialPorts().get(i).equals("COM4")) || (Arduino.getSerialPorts().get(i).equals("COM5")) || (Arduino.getSerialPorts().get(i).equals("COM7"))) {
                        MostrarPulso.jButton2.setEnabled(true);
                        MostrarPulso.jButton1.setEnabled(true);
                        h = true;
                        MostrarPulso.puerto = Arduino.getSerialPorts().get(i);
                        break;

                    } else {
                        continue;
                    }
                }
            }
            try {
                if (h) {
                    if (Arduino.getSerialPorts().size() == 1 || Arduino.getSerialPorts().isEmpty()) {

                        MostrarPulso.jButton2.setEnabled(false);
                        MostrarPulso.jButton1.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Arduino Desconectado");
                        try {
                            Arduino.flushSerialPort();
                            Arduino.killArduinoConnection();
                        } catch (ArduinoException ex) {

                        } catch (SerialPortException ex) {
                            
                        }
                        h = false;
                    }
                }
            } catch (NullPointerException npe) {
                h = false;
                MostrarPulso.jButton2.setEnabled(false);
                MostrarPulso.jButton1.setEnabled(true);
                
                JOptionPane.showMessageDialog(null, "Arduino Desconectado");

                try {

                    Arduino.killArduinoConnection();
                } catch (ArduinoException ex) {

                }
            }
        }

    }

}
