package b;

public class main {
	
	public static void main (String[]args)
	{
		Mercedes m240 = new Mercedes ();	
		
		m240.Modèle = "m240";
		m240.Année_Modèle = 1981;
		m240.Wheels = 4;
		m240.CV=8 ;
		m240.num ++;
		System.out.println( "  model = " + m240.Modèle +" Wheels = "+ m240.Wheels + "  Année_Modèle = " + m240.Année_Modèle + "  CV = " + m240.CV );
		System.out.println(Volkswagen.get_num());
	
		Volkswagen Golf= new Volkswagen ();
		Golf.Modèle="Golf";
		Golf.Année_Modèle=2014;
		Golf.Wheels=4;
		Golf.CV=8;
		Golf.num ++;
		
	System.out.println( "  model = " + Golf.Modèle +" Wheels = "+ Golf.Wheels + "  Année_Modèle = " + Golf.Année_Modèle + "  CV = " + Golf.CV );
	System.out.println(Volkswagen.get_num());
	
	}
		
}

