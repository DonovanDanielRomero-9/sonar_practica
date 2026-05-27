package main.java.com.practica;

public class Calculator {
    
    public int divide(int a, int b) {
	// Hacemos un if else si hazen que b sea 0 no de u error como antes se pone asi para que via que si b es 0 salga 0 	no error
	if (b == 0) {
	    return 0; // Retornamos un valor controlado para evitar el fallo
	} else {
	    return a / b; // Realizamos la división segura
	}
        
    }

    public String status(int val) {
        String s = null;
        if (val > 0){ 
	    s = "positive";
	} else {
	    s = "negative";
	}
        return s.toUpperCase(); // Hemos puesto un else para cuando sea 0 o menos salga el mensaje de negativo y al contrario positivo para que no de el error que habia antes era por eso que no tenia un texto o palabra que se igual a 0 o menos
    }

}

