package scouting2017.salinerobotics.org.a2017scoutingapp;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;

public class Bluetooth extends Thread {
    public volatile boolean destroy=false;
    private BluetoothAdapter ba;
    //BluetoothServerSocket bss=ba.listenUsingRfcommWithServiceRecord(NAME, MY_UUID);

    public void run(){
        //ba.listenUsingRfcommWithServiceRecord("5066ScoutServer","");
        while(!destroy){
            destroy=true; //Temp anti-runaway thread var
        }
    }

}
