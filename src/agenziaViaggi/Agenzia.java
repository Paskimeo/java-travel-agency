package agenziaViaggi;


import java.time.LocalDate;
import java.util.Scanner;




public class Agenzia {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag= false;
		String destinazione;
		int giornoInizio, giornoFine, meseInizio, meseFine, annoInizio, annoFine;
		LocalDate inizioVacanza = null, fineVacanza = null;

			do 
			{
				

			try 
			{
				
			      //richiesta destinazione
				  System.out.print("la destinazione:  ");
			      destinazione = scan.nextLine();
			      
			      
			      //richiesta giorno inizio
			      System.out.print("Inserisci il giorno iniziale: ");
			      giornoInizio = Integer.parseInt(scan.nextLine());
				
			      //richeista mese inizio
			      System.out.print("nserisci il mese iniziale: ");
			      meseInizio = Integer.parseInt(scan.nextLine());
				
			      //richiesta anno inizio
			      System.out.print("nseriscil'anno iniziale: ");
			      annoInizio = Integer.parseInt(scan.nextLine());
			      
				
			      //richiesta giorno fine
			      System.out.print("Inserisci il giorno finale: ");
			      giornoFine = Integer.parseInt(scan.nextLine());
				
			      //richeista mese fine
			      System.out.print("nserisci il mese finale: ");
			      meseFine = Integer.parseInt(scan.nextLine());
				
			      //richiesta anno fine
			      System.out.print("nseriscil'anno finale: ");
			      annoFine = Integer.parseInt(scan.nextLine());
			      
			      Vacanza creazioneVacanze = new Vacanza(destinazione, giornoInizio, meseInizio, annoInizio, giornoFine, meseFine, annoFine);
			      System.out.println(creazioneVacanze.toString());
			      System.out.println("Grazie, per aver creato il tuo biglietto");
			      flag = true;
			      
			      
			}catch (NumberFormatException errorecompsizione) {
			      System.out.println("impossibile completare la registrazione");
			      System.out.println(errorecompsizione.getMessage());
			    } 
			
			 catch (Exception e) {
			      System.out.println("impossibile ocmpletare la registrazione");
			      System.out.println(e.getMessage());
			    }
			
			System.out.println("Per piacere inserisci i dati come richiesti");  
			   

			}while (!flag); 
				    
			

			    scan.close();

	}

}
