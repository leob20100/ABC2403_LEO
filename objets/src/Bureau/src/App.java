import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		BureauErgo bureauWafae1 = new BureauErgo(true,BigDecimal.valueOf(75),BigDecimal.valueOf(75), BigDecimal.valueOf(80), BigDecimal.valueOf(100), BigDecimal.valueOf(64), BigDecimal.valueOf(100) );
		
		BureauErgo bureauWafae = new BureauErgo();
		BureauErgo bureauJP = new BureauErgo();
		
		boolean brancher = bureauWafae.brancher();
		boolean brancher1 = bureauJP.brancher();
		
		BureauErgo bureauJP1 = new BureauErgo ();
		
		boolean result = bureauJP1.positionnerALaHauteur(BigDecimal.valueOf(56));

	}

}
