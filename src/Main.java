public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		// Usamos tolowerCase() para que toda String seja impressa minusculas
		   String s01 = original.toLowerCase();
		   
		// Usamos toUpperrCase() para que toda String seja impressa maiusculas
		   String s02 = original.toUpperCase();
		   
		// Usamos trim() para eliminar todos espaços em branco dos cantos das Strings
		   String s03 = original.trim();
		   
		// Usamos substring() para gerar uma nova String apartir do numeros que indicarmos
		   String s04 = original.substring(2);
			
	   // podemos passar o dois parametos o inicio do corte e o fim DO CORTE (2, 9)
		   String s05 = original.substring(2, 9);

		// podemos usar o replace('a' , 'x') para trocar uma letra por outra 
		   String s06 = original.replace("a", "x");
		   String s07 = original.replace("abc", "xy");
		   
		   // usamos indexOf para saber a primeira ocorrencia do parametro que passamos 
		   int i = original.indexOf("bc");
		   
		   // usamos lastIndexOf para saber saber a ultima ocorrência do parametro
		   int j = original.lastIndexOf("bc");

	 
	
	  
		
		System.out.println("Original ");
		
		System.out.println("tolowerCase: " + s01 + "-");
		
		System.out.println("toUpperCase: " + s02 + "-");
		
		System.out.println("trim: " + s03 +"-" );
		
		System.out.println("substring (2) " + s04 + "-");
		
		System.out.println("substring (2, 9) " + s05 + "-");
		
		System.out.println("replace('a' , 'x') " + s06 + "-");
		
		System.out.println("replace('abc' , 'xy') " + s07 + "-");
		
		System.out.println("index Of 'bc':"  + i );
		
		System.out.println("last index Of 'bc':"  + j);
	}

}                                                                                                                                                                                        

