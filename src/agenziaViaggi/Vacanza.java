package agenziaViaggi;

//localdata
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
	

public class Vacanza {
	
	

	
	//attributi
	private String destinazione;
	private int giornoInizio,meseInizio,annoInizio;
	private int giornoFine,meseFine,annoFine;
	
	//costruttore
	public Vacanza(String destinazione, int giornoInizio, int meseInizio, int annoInizio,int giornoFine, int meseFine, int annoFine)  throws Exception  {
		super();
		this.destinazione = destinazione;
		this.giornoInizio = giornoInizio;
		this.meseInizio = meseInizio;
		this.annoInizio = annoInizio;
		this.giornoFine = giornoFine;
		this.meseFine = meseFine;
		this.annoFine = annoFine;
		this.inizioViaggio = inizioViaggio;
		this.fineViaggio = fineViaggio;
		
		
		controlloInizioVacanza();
		controlloFineVacanza();
		controlloDestinazione();
	}
	
	
	//setter e getter
	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public int getGiornoInizio() {
		return giornoInizio;
	}

	public void setGiornoInizio(int giornoInizio) {
		this.giornoInizio = giornoInizio;
	}

	public int getMeseInizio() {
		return meseInizio;
	}

	public void setMeseInizio(int meseInizio) {
		this.meseInizio = meseInizio;
	}

	public int getAnnoInizio() {
		return annoInizio;
	}

	public void setAnno(int annoInizio) {
		this.annoInizio= annoInizio;
	}

	public int getGiornoFine() {
		return giornoFine;
	}


	public void setGiornoFine(int giornoFine) {
		this.giornoFine = giornoFine;
	}


	public int getMeseFine() {
		return meseFine;
	}


	public void setMeseFine(int meseFine) {
		this.meseFine = meseFine;
	}


	public int getAnnoFine() {
		return annoFine;
	}


	public void setAnnoFine(int annoFine) {
		this.annoFine = annoFine;
	}


	public void setAnnoInizio(int annoInizio) {
		this.annoInizio = annoInizio;
	}


	public LocalDate getInizioViaggio() {
		return inizioViaggio;
	}

	public void setInizioViaggio(LocalDate inizioViaggio) {
		this.inizioViaggio = inizioViaggio;
	}

	public LocalDate getFineViaggio() {
		return fineViaggio;
	}

	public void setFineViaggio(LocalDate fineViaggio) {
		this.fineViaggio = fineViaggio;
	}
	
	//metod composizione date
		LocalDate inizioViaggio = LocalDate.of(meseInizio, giornoInizio, annoInizio);
		
		LocalDate fineViaggio = LocalDate.of(meseFine, giornoFine, annoFine);

		
		
	//metodi controllo date
		public void controlloInizioVacanza() throws Exception 
		{
	        if (inizioViaggio.equals(null))
	            throw new Exception("inserisci una data per piacere, composta da giorno,mese,anno");
		
	        if (inizioViaggio.isBefore(LocalDate.now()))
	            throw new Exception("La data non puo essere una data del passato");
		}
		
		public void controlloFineVacanza() throws Exception 
		{
	        if (fineViaggio.equals(null))
	            throw new Exception("inserisci una data per piacere, composta da giorno,mese,anno");
		
	        if (fineViaggio.isBefore(inizioViaggio))
	            throw new Exception("La data non puo essere una data prima dell'inizio");
		}
		
		
		//metodo controllo destinazione
			public void controlloDestinazione() throws Exception 
			{
				if(destinazione == null)
					throw new Exception("devi isnerire un luogo di destinazione");
			}
			
			
			private String formattaDataInizio() {
				
				return inizioViaggio.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
				
			}
			
			private String formattaDataFine() {
				
				return fineViaggio.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
				
			}
			
			
			

			public String toString() {
				
				String Stampa;
				
				Period durataVacanza = Period.between(inizioViaggio, fineViaggio);
				
				return Stampa = "la tua vacanza durerà: " + durataVacanza + " con destionazione: " + destinazione + "dal " + inizioViaggio + " al " + fineViaggio + "il tuo biglietto è stato creato";
			}
}
