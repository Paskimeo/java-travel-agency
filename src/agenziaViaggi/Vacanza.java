package agenziaViaggi;

//localdata
	import java.time.LocalDate;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;

public class Vacanza {
	
	

	
	//attributi
	private String destinazione;
	private int giorno,mese,anno;
	
	
	//costruttore
	public Vacanza(String destinazione, int giorno, int mese, int anno) {
		super();
		this.destinazione = destinazione;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		this.inizioViaggio = inizioViaggio;
		this.fineViaggio = fineViaggio;
	}
	
	
	//setter e getter
	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
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
	
	//metodi
		LocalDate inizioViaggio = LocalDate.of(mese, giorno, anno);
		
		LocalDate fineViaggio = LocalDate.of(mese, giorno, anno);

		
		
	//metodi controllo
		public void controlloInizioVacanza(LocalDate inizioViaggio) throws Exception 
		{
	        if (inizioViaggio.equals(null))
	            throw new Exception("inserisci una data per piacere, composta da giorno,mese,anno");
		
	        if (inizioViaggio.isBefore(LocalDate.now()))
	            throw new Exception("La non puo essere una data del passato");
		}
		
		public void controlloFineVacanza(LocalDate fineViaggio) throws Exception 
		{
	        if (fineViaggio.equals(null))
	            throw new Exception("inserisci una data per piacere, composta da giorno,mese,anno");
		
	        if (fineViaggio.isBefore(LocalDate.now()))
	            throw new Exception("La  non puo essere una data del passato");
		}
}
