package FlightControl;


import FlightControl.UI.TextUI;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
         FlightControl f = new FlightControl();
         Scanner sc = new Scanner(System.in);

        TextUI ui = new TextUI(f,sc);
        ui.start();
    }
}
