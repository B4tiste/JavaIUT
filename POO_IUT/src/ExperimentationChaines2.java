import javax.swing.JOptionPane;

public class ExperimentationChaines2 {

	public static void main(String[] args) {
		
		String lineSep = System.getProperty("line.separator");
		
		String sentence_1 = "Portez ce vieux whisky au juge blond qui fume";
		String sentence_2 = "The quick brown fox jumps over the lazy dog";
		
		String len_sentence_1 = "La phrase en Fran�ais poss�de " + sentence_1.length() + " caract�res";
		String len_sentence_2 = "La phrase en Anglais poss�de " + sentence_2.length() + " caract�res";
		
		/*
		System.out.println(sentence_1);
		System.out.println(sentence_2);
		*/
		
		String final_sentence = sentence_1 + lineSep + len_sentence_1 + lineSep + sentence_2 + lineSep + len_sentence_2;
		
		JOptionPane.showMessageDialog(null, final_sentence);
		
		//System.out.println(final_sentence);
		
	}

}
