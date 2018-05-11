package br.edu.ifsp.b1lp2;

import java.util.Arrays;
import java.util.HashMap;

public class App 
{
    public static void main( String[] args )
    { 
		int i;
		int j;
		int ocorrencias;
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String frase = "Kirby does his taxes Kirby";
		String palavras[] = frase.split(" ");
		
		for(i = 0; i < palavras.length; i++)
		{
			ocorrencias = 0;
			for(j = 0; j < palavras.length; j++)
			{
				if(palavras[j].equals(palavras[i]))
				{
					ocorrencias += 1;
				}
			}
			hmap.put(palavras[i], ocorrencias);
		}
		System.out.println(Arrays.asList(hmap) );
    }
}
