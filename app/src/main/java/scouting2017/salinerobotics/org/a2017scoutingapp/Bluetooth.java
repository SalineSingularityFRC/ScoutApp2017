package scouting2017.salinerobotics.org.a2017scoutingapp;


import android.bluetooth.BluetoothAdapter;

public class Bluetooth extends Thread {
    public volatile boolean destroy=false;
    private BluetoothAdapter ba;

    public void run(){
        //ba.listenUsingRfcommWithServiceRecord("5066ScoutServer","");
        while(!destroy){
            destroy=true; //Temp anti-runaway thread var
        }
    }

}
