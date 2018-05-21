package com.example.brais.monopolly;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class Casillas {

    public Jugador dueño;
    public int precio;
    public int numero;
    public boolean especiales;
    public int tamaño;
    public Bitmap imgCelda;

    public Casillas(int precio, int numero, boolean especiales, int tamaño, Bitmap imgCelda) {
        this.dueño = null;
        this.precio = precio;
        this.numero = numero;
        this.especiales = especiales;
        this.tamaño = tamaño;
        this.imgCelda = imgCelda;
    }

    public Jugador getDueño() {
        return dueño;
    }

    public void setDueño(Jugador dueño) {
        this.dueño = dueño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Bitmap RotateBitmap(Bitmap source, float angle) {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    }
}
