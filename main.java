package b;

public class main {
	
	public static void main (String[]args)
	{
		Mercedes m240 = new Mercedes ();	
		
		m240.Mod�le = "m240";
		m240.Ann�e_Mod�le = 1981;
		m240.Wheels = 4;
		m240.CV=8 ;
		m240.num ++;
		System.out.println( "  model = " + m240.Mod�le +" Wheels = "+ m240.Wheels + "  Ann�e_Mod�le = " + m240.Ann�e_Mod�le + "  CV = " + m240.CV );
		System.out.println(Volkswagen.get_num());
	
		Volkswagen Golf= new Volkswagen ();
		Golf.Mod�le="Golf";
		Golf.Ann�e_Mod�le=2014;
		Golf.Wheels=4;
		Golf.CV=8;
		Golf.num ++;
		
	System.out.println( "  model = " + Golf.Mod�le +" Wheels = "+ Golf.Wheels + "  Ann�e_Mod�le = " + Golf.Ann�e_Mod�le + "  CV = " + Golf.CV );
	System.out.println(Volkswagen.get_num());
	
	}
		
}

